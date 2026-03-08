import java.util.*;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(50) + 1;
        Scanner sc = new Scanner(System.in);
        boolean won = false;   

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 50. Can you guess it?");
        System.out.print("Enter your guess:");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Your guess is correct");
            System.out.println("You won the game");
            System.out.println("Score=100");
            won = true;   
        }

        if (a > b) {
            System.out.println("Your guess is too low");
        }

        if (a < b) {
            System.out.println("Your guess is too high");
        }

        int c = 0;

        if (a != b) {
            for (int i = 1; i <= 4; i++) {
                System.out.print("Enter your guess:");
                c = sc.nextInt();

                if (a == c) {
                    System.out.println("Your guess is correct");
                    System.out.println("You won the game");

                    if (i == 1) {
                        System.out.println("Score=80");
                    }
                    if (i == 2) {
                        System.out.println("Score=60");
                    }
                    if (i == 3) {
                        System.out.println("Score=40");
                    }
                    if (i == 4) {
                        System.out.println("Score=20");
                    }

                    won = true;   
                    break;
                }

                if (a > c) {
                    System.out.println("Your guess is too low");
                }

                if (a < c) {
                    System.out.println("Your guess is too high");
                }
            }
        }

        
        if (!won) {
            System.out.println("Better luck next time!");
            System.out.println("Your score is 0");
            System.out.println("The correct number was:" + a);
        }

        sc.close();
    }
}