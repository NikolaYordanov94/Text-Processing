package FinalExamOldExams;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawPassword = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder(rawPassword);

        while (!command.equals("Done")){

            String [] commandParts = command.split(" ");
            String commandType = commandParts[0];

            switch (commandType){
                case"TakeOdd":

                    for (int i = 0; i < passwordBuilder.length(); i++) {

                            passwordBuilder.deleteCharAt(i);
                    }
                    System.out.println(passwordBuilder);
                    break;

                case"Cut":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int lengthToCut = Integer.parseInt(commandParts[2]);

                    passwordBuilder.delete(startIndex, startIndex + lengthToCut);
                    System.out.println(passwordBuilder);
                    break;

                case"Substitute":
                    String substringToReplace = commandParts[1];
                    String newSubstring = commandParts[2];

                    if(passwordBuilder.toString().contains(substringToReplace)){
                        while (passwordBuilder.toString().contains(substringToReplace)){
                            int startIndexSub = passwordBuilder.indexOf(substringToReplace);
                            int endIndexSub = startIndexSub + substringToReplace.length();

                            passwordBuilder.replace(startIndexSub, endIndexSub, newSubstring);
                        }
                        System.out.println(passwordBuilder);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", passwordBuilder);
    }
}
