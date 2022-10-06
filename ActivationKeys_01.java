package ExamPreparationPart2;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();
        String inputLine = scanner.nextLine();

        while(!inputLine.equals("Generate")){

            String [] inputParts = inputLine.split(">>>");

            String commandType = inputParts[0];
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;
            int startSliceIndex = 0;
            int endSliceIndex = 0;

            switch (commandType){

                case"Contains":
                    String substringPart = inputParts[1];
                    if(rawActivationKey.contains(substringPart)){
                        System.out.printf("%s contains %s%n", rawActivationKey, substringPart);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;

                case"Flip":
                    String upOrLowCase = inputParts[1];
                    startIndex = Integer.parseInt(inputParts[2]);
                    endIndex = Integer.parseInt(inputParts[3]);

                    substring = rawActivationKey.substring(startIndex, endIndex);
                    if(upOrLowCase.equals("Upper")){
                        rawActivationKey = rawActivationKey.replace(substring, substring.toUpperCase());
                    }else if(upOrLowCase.equals("Lower")){
                        rawActivationKey = rawActivationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(rawActivationKey);
                    break;

                case"Slice":
                    startSliceIndex = Integer.parseInt(inputParts[1]);
                    endSliceIndex = Integer.parseInt(inputParts[2]);

                    substring = rawActivationKey.substring(startSliceIndex, endSliceIndex);
                    rawActivationKey = rawActivationKey.replace(substring, "");

                    System.out.println(rawActivationKey);
                    break;

            }

            inputLine = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", rawActivationKey);

    }
}
