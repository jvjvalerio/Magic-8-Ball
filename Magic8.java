import java.util.Random;
import java.util.Scanner;

public class Magic8 {
    public static void main(String[] args) {
        // Intro message 
        System.out.println("Welcome to Julios Magic 8 Ball game!");
        System.out.println("Would you like to play? If so please type 1 to play or 2 to quit");
        
        // Scanner object created for user input
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();

        if(response == 1) {
            System.out.println("Yay! Welcome!");
        }

        else if (response == 2) {
            System.out.println("Ew wow ok bye then!");
        }

        else {
            System.out.println("Please enter either 1 or 2!");
        }

        // Close Scanner object
        input.close();

        // Playing the game
        System.out.println("To play please shake the 8 ball");
        System.out.println("shaking......");
        System.out.println(".....shaking.....");
        System.out.println("DONE! Lets see what we've got....");

        // Create a random object
        Random random = new Random();
        int eightBallNumber = random.nextInt(8);


        // Magic 8 Ball Responses
        switch (eightBallNumber) {
            case 0: eightBallNumber = 0;
                System.out.println("OOPS! You've dropped the magic 8 ball! please shake again!");
                break;

            case 1: eightBallNumber = 1;
                System.out.println("As I see it, yes");
                break;

            case 2: eightBallNumber = 2;
                System.out.println("Ask again later");
                break;

            case 3: eightBallNumber = 3;
                System.out.println("Better not tell you now");
                break;
            
            case 4: eightBallNumber = 4;
                System.out.println("Cannot predict now");
                break;
            
            case 5: eightBallNumber = 5;
                System.out.println("Don't count on it");
                break;
            
            case 6: eightBallNumber = 6;
                System.out.println("Outlook not so good");
                break;
            
            case 7: eightBallNumber = 7;
                System.out.println("Reply hazy try again");
                break;
            
            case 8: eightBallNumber = 8;
                System.out.println("Signs point to yes");
                break;
        }
    }
}