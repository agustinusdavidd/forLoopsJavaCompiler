public class LexicalAnalyzer {
    public static String[] doLA(String sentence) {
        String hasil[] = new String[];
    }

    public static String getLexic(String word) {
        if (I_Word_FA.valid_I_Word(word) || J_Word_FA.valid_J_Word(word) || K_Word_FA.valid_K_Word(word) || L_Word_FA.valid_L_Word(word)) {
            return "1";
        } else if (Equals_FA.valid_Equals(word)) {
            return "2";
        } else if (LessEquals_FA.valid_lessEquals(word)) {
            return "3";
        } else if (GreaterEquals_FA.valid_moreEquals(word)) {
            return "4";
        } else if (LessThan_FA.valid_lessThan(word)) {
            return "5";
        } else if (GreaterThan_FA.valid_greaterThan(word)) {
            return "6";
        } else if (Increment_FA.valid_increment(word)) {
            return "7";
        } else if (Decrement_FA.valid_decrement(word)) {
            return "8";
        } else if (AdditionAssignment_FA.valid_plusEquals(word)) {
            return "9";
        } else if (SubtractionAssignment_FA.valid_minusEquals(word)) {
            return "10";
        } else if () {
            return "11";
        } else if () {
            return "12";
        } else if () {
            return "13";
        } else if () {
            return "14";
        } else if () {
            return "15";
        } else if (For_FA.valid_for(word)) {
            return "16";
        } else if () {
            return "17";
        } else if (Int_FA.valid_int(word)) {
            return "18";
        }
    }
}
