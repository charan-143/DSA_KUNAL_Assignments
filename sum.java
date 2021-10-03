
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Adding two numbers program");
        System.out.println("Enter the Number1 :");
        int num1 = input.nextInt();
        System.out.println("Enter the Number2 :");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("the summ of "+num1+" and "+num2+" : "+sum);
        input.close();

    }
}
