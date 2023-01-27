import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner imfeelsleepy = new Scanner(System.in);
        System.out.print("Enter product name : ");
        String name = imfeelsleepy.nextLine();
        System.out.print("Enter product price : ");
        double price = imfeelsleepy.nextDouble();
        System.out.print("Enter the amount of buying : ");
        int amount = imfeelsleepy.nextInt();
        imfeelsleepy.close();
        double total = price * amount;
        double finalprice = total - (total * 0.05);
        System.out.println("--------------------------------------------------------");
        System.out.println("Product name is " + name);
        System.out.println("Price is " + price);
        System.out.println("Amount of buying is " + amount);
        System.out.println("Total price is " + price + " * " + amount + " = " + total);
        System.out.println("Discount price is " + total + " (" + total + ") * 0.05 = " + finalprice);
    }
}
