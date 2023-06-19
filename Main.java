import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] lexes = LexicalAnalyzer.doLA(sentence);

        int i = 0;
        while(!lexes[i].equalsIgnoreCase("err") && !lexes[i].equalsIgnoreCase("@")) {
            System.out.print(lexes[i] + " ");
            i++;
        }
        if (lexes[i].equalsIgnoreCase("err")) {
            System.out.print(lexes[i] + " ");
            i++;
        }
        System.out.println();
    }
}
