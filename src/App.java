
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        // write a program to find the greatest number out of three numbers 
        //    take the three numbers as an input from the user
        Scanner s = new Scanner(System.in);

        System.out.println("please enter the first number");
        int a = s.nextInt();

        System.out.println("please enter the second number");
        int b = s.nextInt();

        System.out.println("please enter the third number");
        int c = s.nextInt();

        if((a > b) && (a > c)){
            System.out.println(a + " is greater than " + b + " and " + c);
        }

        else if((b > a) && (b > c)){
            System.out.println(b + " is greater than " + a + " and " + c);
        }

        else{
            System.out.println(c + " is greater than " + a + " and " + b);
            
        }
    }
}
