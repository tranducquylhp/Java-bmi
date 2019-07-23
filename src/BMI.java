import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        double bmi = weight / height /height;

        if (bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi <25){
            System.out.println("Normal");
        } else if (bmi<30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
