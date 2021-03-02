package assignments;

import java.util.Scanner;

public class Fraction_level2 {
    public static void main(String[] args) {
        String fract;
        int num1,num2;
        String arr[]=new String[2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fraction");
        fract=sc.next();
        arr=fract.split("/");
        num1=Integer.valueOf(arr[0]);
        num2=Integer.valueOf(arr[1]);

        System.out.println("Lowest Terms is 1/"+num2/num1);

        sc.close();
    }
}
