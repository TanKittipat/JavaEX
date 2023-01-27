import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input weight (kg) : ");
        int weight = input.nextInt();
        System.out.print("Input height (cm) : ");
        double height = input.nextDouble();
        double h = height / 100;
        double hTwo = h * h;
        double BMI = weight / hTwo;
        input.close();
        System.out.println("-----------------------------------");
        System.out.println("Your BMI is : " + BMI);
        if (BMI > 30) {
            System.out.println("very fat");
        } else if (BMI <= 29.00 && BMI >= 25) {
            System.out.println("fat");
        } else if (BMI >= 23 && BMI <= 24.90) {
            System.out.println("buxom");
        } else if (BMI <= 22.90 && BMI >= 18.50) {
            System.out.println("normal");
        } else {
            System.out.println("slim");
        }
    }
}
