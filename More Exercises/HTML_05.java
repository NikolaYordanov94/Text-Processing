package TextProcessingMoreExercises;

import java.util.Scanner;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.printf("<h1>%n%s%n</h1>%n<article>%n%s%n</article>%n", title, content);

        String comments = scanner.nextLine();

        while(!comments.equals("end of comments")){

            System.out.printf("<div>%n%s%n</div>%n", comments);

            comments = scanner.nextLine();
        }
    }
}
