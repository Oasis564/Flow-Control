
import java.util.Scanner;

public class Switches {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float num1, num2, result;

        int choice;

        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 to quit");
        System.out.println("make a choice");

        choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter the first number");
                num1 = s.nextFloat();
                System.out.println("enter the second number");
                num2 = s.nextFloat();
                result = num1 + num2;
                System.out.println("the answer to " + num1 + "+" + num2 + " " + " is " + result);

                break;

            case 2:
                System.out.println("enter the first number");
                num1 = s.nextFloat();
                System.out.println("enter the second number");
                num2 = s.nextFloat();
                result = num1 - num2;
                System.out.println("the answer to " + num1 + "-" + num2 + " " + " is " + result);

                break;

            case 3:
                System.out.println("enter the first number");
                num1 = s.nextFloat();
                System.out.println("enter the second number");
                num2 = s.nextFloat();
                result = num1 * num2;
                System.out.println("the answer to " + num1 + "*" + num2 + " " + " is " + result);

                break;

            case 4:
                System.out.println("enter the first number");
                num1 = s.nextFloat();
                System.out.println("enter the second number");
                num2 = s.nextFloat();
                result = num1 / num2;
                System.out.println("the answer to " + num1 + "/" + num2 + " " + " is " + result);

                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("invalid choice");
        }

    }

}
