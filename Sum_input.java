package assignments;

import java.util.Scanner;

public class Sum_input {
    public static void main(String[] args) {
        int num1,num2,sum,product;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();
        System.out.println("Enter number2");
        num2=sc.nextInt();
        sum=num1+num2;
        product=num1*num2;
        System.out.println("Sum of 2 numbers "+sum);
        System.out.println("Product of 2 numbers "+product);
        sc.close();
    }
}
