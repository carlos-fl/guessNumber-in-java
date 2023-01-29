import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner guessed = new Scanner(System.in);
        int num = rand.nextInt(10), lifes = 3;
        int user;
        do {
            System.out.println("guess a number between 1 and 10");
            user = guessed.nextInt();
            if(user == num) {
                System.out.println("you won!!!");
                break;
            } else {
                System.out.println("try again");
                lifes--;
                if(lifes == 0) {
                    System.out.println("GAME OVER");
                }
            }
            if(user < num) {
                System.out.println("the number is bigger");
            } else {
                System.out.println("the number is smaller");
            }

        } while(user != num && lifes > 0);
        guessed.close();
        System.out.println("the number was " + num);
    }
}