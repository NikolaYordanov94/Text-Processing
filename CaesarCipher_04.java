package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char currentSymbol = text.charAt(i);
            char encryptSymbol = (char) (currentSymbol + 3);
            encryptedText.append(encryptSymbol);


        }
        System.out.println(encryptedText);
    }
}
