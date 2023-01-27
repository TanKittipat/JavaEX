import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter product name : ");
        String name = src.nextLine();
        System.out.print("Enter product price : ");
        double price = src.nextDouble();
        src.close();
        double vat = (price / 100) * 7;
        double total = price + vat;
        System.out.println("---------------------------");
        System.out.println("The price of " + name + " is " + total);
    }

}
