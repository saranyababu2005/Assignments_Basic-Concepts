package assignments;

import java.util.Scanner;

public class Sumofdigits_level2 {
    public static void main(String[] args) {
        int num,rem,sum = 0,num1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        num1=num;
        do {
            rem=num1%10;
            sum=sum+rem;
            num1=num1/10;
        }while(num1>10);
        sum=sum+num1;
        System.out.println("Sum of digits is "+sum);
        sc.close();
    }
}
