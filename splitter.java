/*
ALL POSSIBLE INPUT
1. Basic For Loop
for (initialization; condition; increment/decrement) {
    // kode yang akan diulang
}

2. Pengulangan dalam suatu data
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}

3. Pengulangan tanpa kondisi
for (;;) {
    // kode yang akan diulang
    // pernyataan break untuk menghentikan loop
}

4. Nested Loop
for (initialization; condition; increment/decrement) {
    // kode yang akan diulang dalam loop luar
    for (initialization; condition; increment/decrement) {
        // kode yang akan diulang dalam loop dalam
    }
}

Mesin Splitter akan melakukan split terhadap input. Contoh :
input : for(int i = 0; i < 10; i++)
output :
    inisialisasi : int i = 0
    kondisi : i < 10
    increment : i++

*/

import java.util.Scanner;

public class splitter {
    public static void main(String[] args) {
        System.out.println("Input from user : ");
        String input = new Scanner(System.in).nextLine();
//        String[] result = splitInput(input);
        String[] result = input.split(";");

        for (String s : result) {
            System.out.println(s);
        }
    }

//    private static String[] splitInput(String input) {
//        /*
//        * Pisahkan input for(int i = 0; i < 10; i++) {} atau for (int number : numbers) {}
//        * berdasarkan {}
//        * */
//
//        input = input.replaceAll("\\s+", "");
//
//        /*
//        * Inputan menjadi
//         */
//    }

    public static String[] splitForLoop(String input) {
        // Menghapus spasi dan tanda kurung dari input
        input = input.replaceAll("\\s", "").replaceAll("[()]", "");

        // Mencari indeks titik koma pertama dan kedua
        int firstSemicolon = input.indexOf(";");
        int secondSemicolon = input.indexOf(";", firstSemicolon + 1);

        // Memisahkan input berdasarkan titik koma
        if (firstSemicolon != -1 && secondSemicolon != -1) {
            String initialization = input.substring(0, firstSemicolon);
            String condition = input.substring(firstSemicolon + 1, secondSemicolon);
            String increment = input.substring(secondSemicolon + 1);

            return new String[] { initialization, condition, increment };
        } else {
            return null; // Format tidak valid
        }
    }
}