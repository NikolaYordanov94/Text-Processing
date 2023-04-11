package FinalExamOldExams;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String instructions = scanner.nextLine();
        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);
        boolean isContainingText = false;

        while(!instructions.equals("Decode")){

            String [] instructionParts = instructions.split("\\|");

            String typeOfCommand = instructionParts[0];

            switch (typeOfCommand){

                case"Move":
                    int endIndex = Integer.parseInt(instructionParts[1]);
                    String substring = decryptedMessage.substring(0, endIndex);
                    decryptedMessage.delete(0, endIndex);
                    decryptedMessage.append(substring);
                    break;

                case"Insert":

                    String textToInsert = instructionParts[2];
                    int index = Integer.parseInt(instructionParts[1]);
                        decryptedMessage.insert(index, textToInsert);
                    break;

                case"ChangeAll":
                    String textToChange = instructionParts[1];
                    String newText = instructionParts[2];

                        while (decryptedMessage.toString().contains(textToChange)) {
                            int startIndexForChange = decryptedMessage.indexOf(textToChange);
                            int endIndexForChange = startIndexForChange + textToChange.length();
                            decryptedMessage.replace(startIndexForChange, endIndexForChange, newText);
                        }

                    break;
            }

            instructions = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", decryptedMessage);
    }
}
