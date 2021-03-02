package assignments;

import java.util.Scanner;

public class RecursiveFactorial_loops {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        fact=recurfact(fact,num);
        System.out.println("Factorial of a given number is "+fact);
        sc.close();
    }
    public static int recurfact(int fact,int num)
    {
        if(num==0) {
            fact=fact*1;
            return fact;
        }
        else {
            fact = fact * num;
            return recurfact(fact, --num);
        }
    }
}
