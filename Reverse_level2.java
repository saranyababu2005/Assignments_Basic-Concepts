package assignments;

import java.util.Scanner;

public class Reverse_level2 {
    public static void main(String[] args) {
        int num;
        String sb;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        num=sc.nextInt();
        sb=String.valueOf(num);
        StringBuilder reverse1 =new StringBuilder(sb);
        System.out.println(reverse1.reverse());
        sc.close();
    }
}
