import java.util.Scanner;

public class MyMath {

    public static int gcf(int a, int b) {
        // A is greater than B
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Euclid's algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        // Get input for a and b
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        //Print GFC
        System.out.println("The GCF of " + a + " and " + b + " is " + gcf(a, b));
    }
}