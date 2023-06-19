public class J_Word_FA {
    public static boolean valid_J_Word(String str) {
        str += "@";
        char[] word = str.toCharArray();

        String state = "q1";
        String[] baris = new String[] {"q1", "q2", "q3"};
        String[] kolom = new String[] {"j", "selain j", "EOS"};

        String[][] transitionTable = new String[3][3];

        transitionTable[0][0] = "q2";
        transitionTable[0][1] = "q3";
        transitionTable[0][2] = "err";

        transitionTable[1][0] = "q3";
        transitionTable[1][1] = "q3";
        transitionTable[1][2] = "acc";

        transitionTable[2][0] = "q3";
        transitionTable[2][1] = "q3";
        transitionTable[2][2] = "err";

        char symbol;
        String input;
        int i = 0;
        int b = 0, k = 0;                                                       //baris dan kolom
        while(!state.equalsIgnoreCase("acc")){
            symbol = word[i];
            if(symbol == 'j'){
                input = "j";
            } else if (symbol == '@') {
                input = "EOS";
            } else if(symbol != 'j') {
                input = "selain j";
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
        System.out.println(valid_J_Word("j"));                                   //return true
        System.out.println(valid_J_Word(")"));                                   //return false
    }
}