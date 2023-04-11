package FinalExamOldExams;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedText = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder resultTextBuilder= new StringBuilder(concealedText);

        while (!command.equals("Reveal")){

            String [] commandParts = command.split(":\\|:");
            String commandType = commandParts[0];

            switch (commandType){

                case"InsertSpace":
                    int indexOfSpace = Integer.parseInt(commandParts[1]);
                    resultTextBuilder.insert(indexOfSpace, " ");
                    System.out.println(resultTextBuilder);
                    break;

                case"Reverse":
                    String substringForReverse = commandParts[1];
                    if(resultTextBuilder.toString().contains(substringForReverse)){
                        int startIndex = resultTextBuilder.indexOf(substringForReverse);
                        int endIndex = startIndex + substringForReverse.length();
                        resultTextBuilder.delete(startIndex, endIndex);
                        StringBuilder substringForReverseBuilder = new StringBuilder(substringForReverse);
                        resultTextBuilder.append(substringForReverseBuilder.reverse());
                        System.out.println(resultTextBuilder);
                    }else{
                        System.out.println("error");
                    }
                    break;

                case"ChangeAll":
                    String substringToReplace = commandParts[1];
                    String newSubstring = commandParts[2];

                    while (resultTextBuilder.toString().contains(substringToReplace)){
                        int startIndexForReplace = resultTextBuilder.indexOf(substringToReplace);
                        int endIndexForReplace = startIndexForReplace + substringToReplace.length();
                        resultTextBuilder.replace(startIndexForReplace, endIndexForReplace, newSubstring);
                    }
                    System.out.println(resultTextBuilder);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", resultTextBuilder);
    }
}
