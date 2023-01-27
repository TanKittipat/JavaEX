import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int one = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int two = input.nextInt();
        input.close();
        System.out.println("-----------------------------");
        System.out.println(one + " + " + two + " = " + (one + two));
        System.out.println(one + " - " + two + " = " + (one - two));
        System.out.println(one + " * " + two + " = " + (one * two));
        System.out.println(one + " / " + two + " = " + (one / two));
        System.out.println(one + " % " + two + " = " + (one % two));
    }
}