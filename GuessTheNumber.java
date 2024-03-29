import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        
        Random rand = new Random();
        int correctnumber= rand.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        int guesscount=0;
        System.out.println("Welcome to the Guess The Number Game");
        while(guesscount < 6){
            
            System.out.println("Enter your Guess");
            int userguess= scanner.nextInt();
            guesscount++;
            if(correctnumber==userguess){
                System.out.println("Congrats, you won the game in" +    guesscount  + " " +"guesess");
                break;
            }else if(userguess<correctnumber){
                System.out.println("Your guess is low , try again!");
            }
            else{
                System.out.println("Your guess is high, try again!");
            }}
            
            if (guesscount == 6) {
                System.out.println("You didn't get the number in 5 guesses");
                System.out.println("You lose.  The correct number is " + correctnumber);
            }
            scanner.close();
        }
    }

