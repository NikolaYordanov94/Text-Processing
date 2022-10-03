package TextProcessingMoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@(?<name>[\\s\\W\\w\\s\\W\\w\\s\\W\\w]*\\w+[\\s\\W\\w\\s\\W\\w\\s\\W\\w]*)[|][\\s\\W\\w\\s\\W\\w\\s\\W\\w]*#(?<age>[\\s\\W\\w\\s\\W\\w\\s\\W\\w]*[0-9]+[\\s\\W\\w\\s\\W\\w\\s\\W\\w]*)[*]");

        for (int i = 1; i <= n; i++) {
            String inputText = scanner.nextLine();
            Matcher matcher = pattern.matcher(inputText);



            if(matcher.find()){

                String name = matcher.group("name");
                String age = matcher.group("age");

                System.out.printf("%s is %s years old.%n", name, age);

            }
        }
    }
}
