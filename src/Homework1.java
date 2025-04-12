import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("please enter a number between 1 to 7, 1 is monday and the rest are the remaining days towards sunday/7");

        int choice;
        choice = s.nextInt();

        

        if(choice == 1){
            System.out.println("morning monday!");
        }

        else if (choice == 2) {
            System.out.println("Tiny Tuesday!");
        }

        else if (choice == 3) {
            System.out.println("Working Wedensday!");
        }

        else if (choice == 4) {
            System.out.println("Thirsty Thursday!");
        }

        else if (choice == 5) {
            System.out.println("Fun Friday!");
        }

        else if (choice == 6) {
            System.out.println("Sappy Saturday!");
        }

        else if (choice == 7) {
            System.out.println("Sunny Sunday!");
        }

        else{
            System.out.println("invalid choice.");
        }






    }
}
