package assignments;

import java.util.Scanner;

public class Absoulte_conditional {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        System.out.println("Absolute value of the given num "+Math.abs(num));

        sc.close();
    }
}
