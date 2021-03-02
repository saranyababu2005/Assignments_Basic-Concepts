package assignments;

import java.util.Scanner;

public class Area_input {
    public static void main(String[] args) {
        double length = 0,breadth = 0,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length ");
        length=sc.nextDouble();
        System.out.println("Enter breath ");
        breadth=sc.nextDouble();
        area=length*breadth;
        System.out.println("Area of a rectangle "+(int)area);
    }
}
