package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//код: {буква}{число}{буква}

        String input = scanner.nextLine(); //"A12b s17G"
        String [] codes = input.split("\\s+");//["A12b", "s17G"]

        double totalSum = 0; // сума от числата на всички кодове
        for (String code : codes) {
            //код: {буква}{число}{буква}
            //пресмятане на числото
            double number = getModifiedNumber(code);
            //добавяме крайното число от кода към общата сума
            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String code) {
        //код: "{буква}{число}{буква}"
        //"A12b"
        char firstLetter = code.charAt(0); //'A'
        char secondLetter = code.charAt(code.length() - 1); // 'b'

        double number = Double.parseDouble(code.replace(firstLetter, ' ') //" 12b"
                .replace(secondLetter, ' ') //" 12 "
                .trim()); //"12" -> 12


        //проверките за първата буква -> firstLetter
        if (Character.isUpperCase(firstLetter)) {
            //главна буква
            //аски код: [65; 90]
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        } else {
            //малка буква
            //аски код: [97; 122]
            int positionLowerCase = (int) firstLetter - 96;
            number *= positionLowerCase;
        }

        //проверки за втората буква -> secondLetter
        if (Character.isUpperCase(secondLetter)) {
            //главна буква
            //аски код: [65; 90]
            int positionUpperLetter = (int) secondLetter - 64;
            number -= positionUpperLetter;
        } else {
            //малка буква
            //аски код: [97; 122]
            int positionLowerCase = (int) secondLetter - 96;
            number += positionLowerCase;
        }

        return number;
    }
}
