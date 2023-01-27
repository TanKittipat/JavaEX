import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input variable 'A' : ");
        int a = input.nextInt();
        System.out.print("Input variable 'B' : ");
        int b = input.nextInt();
        input.close();
        int temp;
        System.out.println("----------------------------------------");
        System.out.println("Before swapping : A,B = " + a + " , " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : A,B = " + a + " , " + b);
    }
}
