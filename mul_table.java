

import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table program");
        System.out.println("Enter the Number :");
        int num = input.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
        input.close();
    }
}
