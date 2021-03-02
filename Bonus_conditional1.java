package assignments;

import java.util.Scanner;

public class Bonus_conditional1 {
    public static void main(String[] args) {
        double salary,bonus;
        int service;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of years you are in service");
        service=sc.nextInt();
        System.out.println("Enter your salary");
        salary=sc.nextDouble();
        if(service>5)
        {
            bonus= salary*5/100;
            System.out.println("Bonus amount "+bonus);
            salary=salary+bonus;
            System.out.println("Salary including bonus "+salary);
        }
        else
            System.out.println("No bonus for you. Salary is "+salary);
        sc.close();
    }
}
