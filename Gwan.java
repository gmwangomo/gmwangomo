import java.util.Scanner;
public class Gwan{

    // variables to be used in the class 
   // public static int Avg;
// creating a method of Average of the marks
    public static void Average(){
        try (Scanner Input = new Scanner(System.in)) {
            //creating statements to get the length of marks 
                System.out.println("Enter number of Subject: ");
                int a = Input.nextInt();
            
                // Declaring of variable to performing at this method
                    int marks[]= new int[a];
                    int i, Avg; 
                    int Sum = 0;
                
                    // Assing for input from the user of the programs
                    for ( i = 0; i < marks.length; i++){
                        System.out.print("Enter your Marks: ");
                        marks[i] = Input.nextInt();
                        Sum = Sum + marks[i];
                    }
                   Avg = Sum / a;
                   System.out.printf("The Average of your marks is:%d \n", Avg);
        }
    }

    public static void Grade(){
        try (Scanner Input = new Scanner(System.in)) {
            //creating statements to get the length of marks 
                System.out.println("Enter number of Subject: ");
                int a = Input.nextInt();
            
                // Declaring of variable to performing at this method
                    int marks[]= new int[a];
                    int i, Avg; 
                    int Sum = 0;
                
                    // Assing for input from the user of the programs
                    for ( i = 0; i < marks.length; i++){
                        System.out.print("Enter your Marks: ");
                        marks[i] = Input.nextInt();
                        Sum = Sum + marks[i];
                    }
                    // compute the Average of the Average inorder to get the value of the 
                    // grade and the POsition of the code 

                   Avg= Sum / a;
        

        if (Avg >= 75){
            System.out.println("Concrugutuation your average is " + " A");
            System.out.println("Excellent");
        }
        else if( Avg >= 60 && Avg <= 74){
            System.out.println("Congrutution your Grade is" + "B+");
            System.out.println("");
        }
        else if( Avg >= 50 && Avg <= 59 ){
            System.out.println("Congroduation your Grade is " + "B");
        }
        else if( Avg >= 40 && Avg <= 49){
            System.out.println("Congraution your Grade is " + "C");
        }
        else if ( Avg >= 30 && Avg <= 39){
            System.out.println("Congroductions Your Grade is " + "D");
        }
        else 
            System.out.println("Oooh sorry your Fail" + "F");
        };
    } 

    //This is the main method of my program 
    public static void main(String[] args){
        System.out.println("Repeart to to run by java Main in your terminar or CMD");
    }
}
