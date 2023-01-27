import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of money (Baht) : ");
        double Baht = scan.nextDouble();
        scan.close();
        double usd = Baht / 35.50;
        String pattern = "0.00";
        DecimalFormat df = new DecimalFormat(pattern);
        String usdString = df.format(usd); 
        System.out.println("------------------------------------------------");
        System.out.println(Baht + " baht to usd is " + usdString);

    }
}
