package assignments;

import java.util.Scanner;

public class Square_conditional {
    public static void main(String[] args) {
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        length=sc.nextInt();
        System.out.println("Enter breadth");
        breadth=sc.nextInt();
        if(length==breadth)
            System.out.println("Length and breadth are same .Its a square");
        else
            System.out.println("Length and breadth are not same .Its not a square");
        sc.close();
    }
}
