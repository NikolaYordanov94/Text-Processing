package TextProcessingMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String morseCode = scanner.nextLine();

        String [] morseCodeSingleWords = morseCode.split("\\|");
        String englishChar = "";
        String englishWord = "";
        String decryptedText = "";

        for (int i = 0; i < morseCodeSingleWords.length; i++) {

            String currentWord = morseCodeSingleWords[i];
            String[] currentWordParts = currentWord.split(" ");

            for (int j = 0; j < currentWordParts.length; j++) {
                String currentChar = currentWordParts[j];

                switch (currentChar){

                    case".-":
                        englishChar = "A";
                        break;
                    case"-...":
                        englishChar = "B";
                        break;
                    case"-.-.":
                        englishChar = "C";
                        break;
                    case"-..":
                        englishChar = "D";
                        break;
                    case".":
                        englishChar = "E";
                        break;
                    case"..-.":
                        englishChar = "F";
                        break;
                    case"--.":
                        englishChar = "G";
                        break;
                    case"....":
                        englishChar = "H";
                        break;
                    case"..":
                        englishChar = "I";
                        break;
                    case".---":
                        englishChar = "J";
                        break;
                    case"-.-":
                        englishChar = "K";
                        break;
                    case".-..":
                        englishChar = "L";
                        break;
                    case"--":
                        englishChar = "M";
                        break;
                    case"-.":
                        englishChar = "N";
                        break;
                    case"---":
                        englishChar = "O";
                        break;
                    case".--.":
                        englishChar = "P";
                        break;
                    case"--.-":
                        englishChar = "Q";
                        break;
                    case".-.":
                        englishChar = "R";
                        break;
                    case"...":
                        englishChar = "S";
                        break;
                    case"-":
                        englishChar = "T";
                        break;
                    case"..-":
                        englishChar = "U";
                        break;
                    case"...-":
                        englishChar = "V";
                        break;
                    case".--":
                        englishChar = "W";
                        break;
                    case"-..-":
                        englishChar = "X";
                        break;
                    case"-.--":
                        englishChar = "Y";
                        break;
                    case"--..":
                        englishChar = "Z";
                        break;
                }

                englishWord += englishChar;
                englishChar = "";
            }

            decryptedText += (englishWord + " ");
            englishWord = "";

            }
        System.out.println(decryptedText);

        }
    }

