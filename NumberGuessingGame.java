import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100 + 1);
        int count = 1;
                int guess = input.nextInt();
        while(guess != number) {
            if(guess < number) {
                System.out.println("Your guess is too low. Try again.");
                count++;
                int nextGuess = input.nextInt();
                guess = nextGuess;
            } else if( guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else {
                System.out.println("Your guess is too high. Try again.");
                count++;
                int nextGuess = input.nextInt();
                guess = nextGuess;
            }
        }
        System.out.println("You guessed the number in " + count + " attempts.");
        input.close();
    }
}
