import java.util.Scanner;
import java.util.Random;
class numGuess{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int targetNumber=rand.nextInt(100)+1;
        int c=0;
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        while(true)
        {
            System.out.print("Enter a guess number(that should match with the system choosen random num): ");
            int guess=sc.nextInt();
            c++;
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + c + " attempts.");
                break; // exit the loop
            }
        }
        sc.close();
    }
}