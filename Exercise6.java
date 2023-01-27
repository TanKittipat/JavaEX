import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("1st input : ");
        double st = src.nextDouble();
        System.out.print("2nd input : ");
        double nd = src.nextDouble();
        src.close();
        double result1 = st - nd;
        double result2 = st + nd;
        double result3 = result1 * result2;
        System.out.println("----------------------------------------");
        System.out.println("A = " + st);
        System.out.println("B = " + nd);
        System.out.println("(" + st + " - " + nd + ")" + "(" + st + " + " + nd + ")" + " = " + result3);
    }

}
