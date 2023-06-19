public class Constant_FA {
    public static boolean valid_LB(String str) {
        str += "@";
        char[] word = str.toCharArray();

        String state = "q1";
        String[] baris = new String[] {"q1", "q2", "q3"};
        String[] kolom = new String[] {"number", "-", "selain number", "EOS"};

        String[][] transitionTable = new String[3][4];

        transitionTable[0][0] = "q2";
        transitionTable[0][1] = "q2";
        transitionTable[0][2] = "q3";
        transitionTable[0][3] = "err";

        transitionTable[1][0] = "q2";
        transitionTable[1][1] = "q3";
        transitionTable[1][2] = "q3";
        transitionTable[1][3] = "acc";

        transitionTable[2][0] = "q3";
        transitionTable[2][1] = "q3";
        transitionTable[2][2] = "q3";
        transitionTable[2][3] = "err";

        char symbol;
        String input;
        int i = 0;
        int b = 0, k = 0;                                                       //baris dan kolom
        while(!state.equalsIgnoreCase("acc")){
            symbol = word[i];
            if(symbol == '0' || symbol == '1' || symbol == '2' || symbol == '3' || 
            symbol == '4' || symbol == '5' || symbol == '6' || symbol == '7' ||
            symbol == '8' || symbol == '9'){
                input = "number";
            } else if (symbol == '-') {
                input = "-";
            } else if (symbol == '@') {
                input = "EOS";
            } else if(!(symbol == '0' || symbol == '1' || symbol == '2' || symbol == '3' || 
            symbol == '4' || symbol == '5' || symbol == '6' || symbol == '7' ||
            symbol == '8' || symbol == '9' || symbol == '-')) {
                input = "selain number";
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
        System.out.println(valid_LB("12312312"));                                   //return true
        System.out.println(valid_LB("-0k"));                                        //return false
        System.out.println(valid_LB("l-0"));                                        //return false
        System.out.println(valid_LB("-0"));                                         //return true
    }
}