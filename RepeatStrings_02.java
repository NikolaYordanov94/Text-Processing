package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] strArr = scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {

            String currentWord = strArr[i];
            int length = currentWord.length();

            String repeatWord = repeatString(currentWord, length);
            repeatList.add(repeatWord);

        }

        System.out.println(String.join("", repeatList));
    }

    public static String repeatString(String s, int count){

        String result = "";

        for (int i = 0; i < count; i++) {

            result += s;
        }
        return result;
    }
}
