import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("choose between 1 or 2 to change farenheit into celsius(1) and celsius to farenheit(2)");

        double celsius;
        double farenheit;
        int choice;
        choice = s.nextInt();

        

        switch (choice) {
            case 1:
                System.out.println("please enter a certain amount farenheit to be turned into celsius");
                farenheit = s.nextDouble();
                celsius = (5/9)*(farenheit-32);
                System.out.println("the answer is " + celsius);

            break;

            case 2:
                System.out.println("please enter a certain amount celsius to be turned into farenheit");
                celsius = s.nextDouble();
                farenheit = (float)(1.80*celsius)+32;
                System.out.println("the answer is " + farenheit);

            break;

            default:
            System.out.println("invalid choice");
        }
    }
}
