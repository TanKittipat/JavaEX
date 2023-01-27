import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int i = input.nextInt();
        input.close();
        int a = 1;
        System.out.println("--------------------------");
        do {
            System.out.println(i + " * " + a + " = " + (i * a));
            a++;
        } while (a <= 12);
    }
}
