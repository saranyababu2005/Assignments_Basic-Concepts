package assignments;

import java.util.Scanner;

public class Quit_loops {
    public static void main(String[] args) {
        int num,total=0,product=1;
        double avg;
        int counter=0;
        char c;
        Scanner sc=new Scanner(System.in);
        do {
            counter++;
            System.out.println("Enter an integer");
             num=sc.nextInt();
             total=total+num;
             product=product*num;
            System.out.println("Press 'C' to continue ,'Q' to quit");
            c=sc.next().charAt(0);
        }while (c!='Q');
        System.out.println("Average "+total/counter);
        System.out.println("Product of numbers is "+ product);

        sc.close();
    }
}
