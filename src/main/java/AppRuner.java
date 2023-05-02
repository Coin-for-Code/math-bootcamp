import java.util.Random;
import java.util.Scanner;

public class AppRuner {
    public static void main(String[] args) {
        Random randomizer = new Random();
        var boundary = 5;

        // Values declaration
        var value1 = randomizer.nextInt(boundary);
        var value2 = randomizer.nextInt(boundary);

        // Computing the answer
        var answer = value1 + value2;

        // Writing a question
        var scanner = new Scanner(System.in);
        System.out.println(String.format("Solve the equation: %1$s + %2$s", value1, value2));
        System.out.print("Write your answer: ");
        var user_answer = scanner.nextInt();

        // Verifying the answer
        if(answer == user_answer){
            System.out.println(String.format("The answer %1$s is correct! Congratulations!", answer));
        } else {
            System.out.println(String.format("The answer was %1$s, yours was wrong :(", answer, user_answer));
        }

    }
}
