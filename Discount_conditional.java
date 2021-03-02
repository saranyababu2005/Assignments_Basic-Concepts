package assignments;

import java.util.Scanner;

public class Discount_conditional {
    public static void main(String[] args) {
        int quantity,perunitcost=100;
        double total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of quantities you want");
        quantity=sc.nextInt();
        total=quantity*perunitcost;
        System.out.println(total);
        if(total>=1000)
        {
            total=total-(0.1*total);
            System.out.println("Total cost after discount "+total);
        }
        else
            System.out.println("Total cost after discount "+total + " There is no discount");

        sc.close();
    }
}
