package assignments;

import java.util.Scanner;

public class Greatest_conditional {
    public static void main(String[] args) {
        int num1,num2,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();
        System.out.println("Enter number2");
        num2=sc.nextInt();
        max=(num1>num2)?num1:num2;
        System.out.println("Greatest of 2 numbers "+max);

        sc.close();
    }
}
