package assignments;

import java.util.Scanner;

public class Print_level1 {
    public static void main(String[] args) {
        int a1;
        double d1;
        char c1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer value");
        a1=sc.nextInt();
        System.out.println("Enter double value");
        d1=sc.nextDouble();
        System.out.println("Enter a character");
        c1=sc.next().charAt(0);
        System.out.println("Integer value "+a1);
        System.out.println("Double value "+d1);
        System.out.println("Character value "+c1);
        sc.close();
    }
}
