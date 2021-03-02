package assignments;

import java.util.Scanner;

public class Avg_loops {
    public static void main(String[] args) {
        int num,total = 0,counter;
        double avg;
        Scanner sc=new Scanner(System.in);
        counter=1;
        System.out.println("Enter 10 numbers");
        while (counter<=10)
        {
            num=sc.nextInt();
            total=total+num;
            counter++;
        }
        System.out.println("Total of 10 nummbers is "+total);
        System.out.println("Average of 10 numbers is "+total/10);

        sc.close();
    }
}
