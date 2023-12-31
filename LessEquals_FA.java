public class LessEquals_FA {
    public static boolean valid_lessEquals(String str) {
        str += "@";
        char[] word = str.toCharArray();

        String state = "q1";
        String[] baris = new String[] {"q1", "q2", "q3", "q4"};
        String[] kolom = new String[] {"<", "=", "selain <=", "EOS"};

        String[][] transitionTable = new String[4][4];

        transitionTable[0][0] = "q2";
        transitionTable[0][1] = "q4";
        transitionTable[0][2] = "q4";
        transitionTable[0][3] = "err";

        transitionTable[1][0] = "q4";
        transitionTable[1][1] = "q3";
        transitionTable[1][2] = "q4";
        transitionTable[1][3] = "err";

        transitionTable[2][0] = "q4";
        transitionTable[2][1] = "q4";
        transitionTable[2][2] = "q4";
        transitionTable[2][3] = "acc";

        transitionTable[3][0] = "q4";
        transitionTable[3][1] = "q4";
        transitionTable[3][2] = "q4";
        transitionTable[3][3] = "err";

        char symbol;
        String input;
        int i = 0;
        int b = 0, k = 0;                                                       //baris dan kolom
        while(!state.equalsIgnoreCase("acc")){
            symbol = word[i];
            if(symbol == '<'){
                input = "<";
            } else if (symbol == '=') {
                input = "=";
            } else if (symbol == '@') {
                input = "EOS";
            } else if(symbol != '<' && symbol != '=') {
                input = "selain <=";
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
        System.out.println(valid_lessEquals("<="));                                   //return true
        System.out.println(valid_lessEquals("<<"));                                   //return false
        System.out.println(valid_lessEquals(">="));                                   //return false
        System.out.println(valid_lessEquals("=="));                                   //return false
    }
}
