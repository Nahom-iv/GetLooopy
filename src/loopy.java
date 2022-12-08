import java.util.Scanner;

public class loopy {

    public static void main(String[] args) {

        for (int x = 1; x <= 30; x += 1) {
            System.out.println(x);
        }

        System.out.println();

        for (int x = 30; x >= 1; x -= 1) {
            System.out.println(x);
        }

        System.out.println();

        for (int x = 0; x <= 18; x += 3) {
            System.out.println(x);
        }

        System.out.println();

        for (int x = 10; x >= 0; x -= 2) {
            System.out.println(x);
        }

        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();

        }




        Scanner sc = new Scanner(System.in);
        double c = 0;
        String error;
        boolean validValue = false;

        while(!validValue) {
            System.out.println("Enter the temperature value in Celsius: ");
            if (sc.hasNextDouble()) {
                c = sc.nextDouble();
                sc.nextLine();
                System.out.println("The temperature in Fahrenheit is " + ((c * 9 / 5) + 32));
                validValue = true;

            } else {
                error = sc.nextLine();
                System.out.println("You Entered " + error + " which is not a valid input, please enter a number");
                System.out.println("Try again");

            }


        }
    }


}
