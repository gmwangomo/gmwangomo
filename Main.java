// A java program to create the view of the developer and the Experiences at the time
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        // Creating a jointing command of two class
        Gwan gwan = new Gwan();
        
        //creating a variable to accept the input of the coding
        int choice;

        System.out.println("Welcome to this progam");
        System.out.println("What do you need to get between \n 1: Average of your Marks \n 2: Grade of your marks");

        System.out.println("Enter your choice: ");
        choice = Input.nextInt();

        switch (choice) {
            case 1:
                gwan.Average();
                break;

            case 2:
                gwan.Grade();
                break;

            default:
                System.out.println("Unregonized input");
                break;
        }
        
        System.out.println("Thanks for using my programs");
        System.out.println("---GM_Developer--");
        
    }
}
