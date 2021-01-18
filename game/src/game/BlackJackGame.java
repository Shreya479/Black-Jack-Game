package game;
import java.util.Scanner;
public class BlackJackGame {
    public static void main(String[] args) {
        int randomnum1 = (int) (1 + Math.random() * 10);
        int randomnum2 = (int) (1 + Math.random() * 10);
        int total;
        char anotherCard = 'y';
        char playAgain;
        Scanner input = new Scanner(System.in);
        System.out.println("First cards: " + randomnum1 + ", " + randomnum2);
        total = randomnum1 + randomnum2;
        System.out.println("Total: " + total);
        while (anotherCard != 'n') {
            if (total <= 21) {
            	System.out.print("Do you want another card? (y/n): ");
                anotherCard = input.next().charAt(0);
                int randomnum3 = (int) (1 + Math.random() * 10);
                System.out.println("Card: " + randomnum3);
                total += randomnum3;
                System.out.println("Total: " + total);
            } 
            else if (total > 21) {
                System.out.println("BUST.");
                System.out.print("Would you like to play again? (y/n): ");
                playAgain = input.next().charAt(0);
            }
        } 
    }
}
            
