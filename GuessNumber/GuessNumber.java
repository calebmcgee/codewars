package GuessNumber;
import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args){
        Scanner check = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 101);

        System.out.println("Guess number between 0 and 100.");

        while (true){
            int userGuess = (int) check.nextInt();
            if (userGuess == randomNum) {
                System.out.println("Correct, the number was " + randomNum); 
                break;
            } else if (userGuess < randomNum) {
                System.out.println("Incorrect, too low");
            } else if (userGuess > randomNum) {
                System.out.println("Incorrect, too high");
            }
        }
    }
}