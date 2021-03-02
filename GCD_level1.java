package assignments;

import java.util.Scanner;

public class GCD_level1 {
    public static void main(String[] args) {
        int num1,num2,min,gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        min=(num1<num2)?num1:num2;
        for(int i=2;i<=min;i++)
        {
            if(((num1%i)==0)&&((num2%i)==0))
                gcd=i;
        }
        System.out.println("GCD is "+gcd);

        sc.close();
    }
}
