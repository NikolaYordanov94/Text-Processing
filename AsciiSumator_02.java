package TextProcessingMoreExercises;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        String textToCheck = scanner.nextLine();
        int sumOfAsciiCodes = 0;

        for (int i = 0; i < textToCheck.length(); i++) {

            int currentChar = textToCheck.charAt(i);

            if(currentChar > start && currentChar < end){
                sumOfAsciiCodes += currentChar;
            }
        }

        System.out.println(sumOfAsciiCodes);

    }
}
