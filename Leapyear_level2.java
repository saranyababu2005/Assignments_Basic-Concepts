package assignments;

import java.util.Scanner;

public class Leapyear_level2 {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check");
        year=sc.nextInt();

        if((year%100)==0)
        {
            if(((year%4)==0)&&((year%400)==0))
                System.out.println("Given year is a leap year");
            else
                System.out.println("Given year is not a leap year");
        }
        else
        {
            if((year%4)==0)
                System.out.println("Given year is a leap year");
            else
                System.out.println("Given year is not a leap year");
        }
            sc.close();
    }
}
