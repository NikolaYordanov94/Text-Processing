package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while(!text.equals("end")){
            String reversed = "";

            for (int i = text.length() - 1; i >= 0; i--) {

                char symbol = text.charAt(i);
                reversed += symbol;
            }

            System.out.printf("%s = %s%n", text, reversed);

            text = scanner.nextLine();
        }
    }
}
