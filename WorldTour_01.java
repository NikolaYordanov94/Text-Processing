package ExamPreparationPart1;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();

        while(!command.equals("Travel")){

            if(command.contains("Add Stop")){
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                if(isValidIndex(index, stopsBuilder)){ //валиден индекс

                    stopsBuilder.insert(index, stopName);
                }
            }else if(command.contains("Remove Stop")){

                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if(isValidIndex(startIndex, stopsBuilder) && isValidIndex(endIndex, stopsBuilder)){

                    stopsBuilder.delete(startIndex, endIndex + 1); // + 1 за да е включително последния индекс

                }


            }else if(command.contains("Switch")){

                String oldText = command.split(":")[1];
                String newText = command.split(":")[2];

                //Правим замяната само ако имаме oldText в текущия текст
                if(stops.contains(oldText)){
                    String updatedText = stopsBuilder.toString().replace(oldText, newText);
                    stopsBuilder = new StringBuilder(updatedText);
                }

            }

            System.out.println(stopsBuilder);
            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);

    }

    public static boolean isValidIndex(int index, StringBuilder builder){

        return index >= 0 && index <= builder.length() - 1;
    }
}
