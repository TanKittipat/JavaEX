import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st number : ");
        int one = input.nextInt();
        System.out.print("Input 2nd number : ");
        int two = input.nextInt();
        System.out.print("Input 3rd number : ");
        int three = input.nextInt();
        System.out.print("Input 4th number : ");
        int four = input.nextInt();
        System.out.print("Input 5th number : ");
        int five = input.nextInt();
        input.close();
        System.out.println("--------------------------------------------------------------");
        double average = ((one + two + three + four + five) / 5);
        System.out.println("Average of " + one + " " + two + " " + three + " " + four + " " + five + " = "
                + average);
    }
}
