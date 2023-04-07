package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder text = new StringBuilder(input);
        int strength = 0;
        int totalStrength = 0;

        for (int positions = 0; positions < text.length(); positions++) {

            char currentSymbol = text.charAt(positions);
            if(currentSymbol == '>'){
                int attackStrength = Integer.parseInt(text.charAt(positions + 1) + "");
                totalStrength += attackStrength;

            }else if(currentSymbol != '>' && totalStrength > 0){
                text.deleteCharAt(positions);
                totalStrength--;
                positions--;
            }
        }
        System.out.println(text);
    }

}
