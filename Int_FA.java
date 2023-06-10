/*
Pada tahapan ini dilakukan analisis leksikal. Dengan input for (int i = 0;i < 10; i++){}
akan dipecah menjadi token-token yang terdiri atas kata kunci, operator, tipe data, konstanta
identifier, dan lain-lain

Di tahap ini akan diimplementasikan mesin finite automata sehingga dapat mengenali pola leksikal
pada kode yang di inputkan, khususnya untuk mengenali pola tipe data "int"
*/
public class Int_FA {
    public static boolean valid_int(String str) {
        /*
        inputan for yang mungkin :
        int, Int, in t, int , INT, dll

        Karena java case sensitive maka yang diterima hanyalah bentuk "int"
        maka dari itu, hindari mengubah seluruh inputan menjadi lower case
         */

        str += "@";                                                                 //@ menandakan end of string
        char[] word = str.toCharArray();

        String state = "q1";
        String[] baris = new String[] {"q1" ,"q2"  ,"q3"  ,"q4"         ,"q5"};
        String[] kolom = new String[] {"i"  ,"n"   ,"t"   ,"selain int" ,"EOS"};    //Selain int juga termasuk penulisan int dalam huruf kapital

        String[][] transitionTable = new String[5][5];

        // baris 1
        transitionTable[0][0] = "q2";
        transitionTable[0][1] = "q5";
        transitionTable[0][2] = "q5";
        transitionTable[0][3] = "q5";
        transitionTable[0][4] = "err";

        // baris 2
        transitionTable[1][0] = "q5";
        transitionTable[1][1] = "q3";
        transitionTable[1][2] = "q5";
        transitionTable[1][3] = "q5";
        transitionTable[1][4] = "err";

        // baris 3
        transitionTable[2][0] = "q5";
        transitionTable[2][1] = "q5";
        transitionTable[2][2] = "q4";
        transitionTable[2][3] = "q5";
        transitionTable[2][4] = "err";

        // baris 4
        transitionTable[3][0] = "q5";
        transitionTable[3][1] = "q5";
        transitionTable[3][2] = "q5";
        transitionTable[3][3] = "q5";
        transitionTable[3][4] = "acc";

        // baris 5
        transitionTable[4][0] = "q5";
        transitionTable[4][1] = "q5";
        transitionTable[4][2] = "q5";
        transitionTable[4][3] = "q5";
        transitionTable[4][4] = "err";

        char symbol;
        String input;
        int i = 0;
        int b = 0, k = 0;                                                       //baris dan kolom
        while(!state.equalsIgnoreCase("acc")){
            symbol = word[i];
            if(symbol == 'i'){
                input = "i";
            } else if (symbol == 'n') {
                input = "n";
            } else if (symbol == 't') {
                input = "t";
            } else if (symbol == '@') {
                input = "EOS";
            } else if(symbol != 'i' && symbol != 'n' && symbol != 't') {
                input = "selain int";
            } else {
                return false;
            }

            for (int j = 0; j < baris.length; j++){
                if (baris[j].equalsIgnoreCase(state)){
                    b = j;
                }
            }
            for (int j = 0; j < kolom.length; j++){
                if (kolom[j].equalsIgnoreCase(input)){
                    k = j;
                }
            }
            state = transitionTable[b][k];
            if(state.equalsIgnoreCase("err")){
                return false;
            }
            i++;
        }

        return state.equalsIgnoreCase("acc");
    }

    public static void main(String[] args) {
        System.out.println(valid_int("intt"));                                  //return false
        System.out.println(valid_int("INT"));                                   //return false
        System.out.println(valid_int("int "));                                  //return false
        System.out.println(valid_int("int"));                                   //return true
    }
}
