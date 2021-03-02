package assignments;

import java.util.Scanner;

public class Attendance_conditional {
    public static void main(String[] args) {
        int percentage;
        int noclassheld,noclassattended;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of classes held");
        noclassheld=sc.nextInt();
        System.out.println("Enter number of classes attended");
        noclassattended=sc.nextInt();

        percentage=noclassattended*100/noclassheld;
        System.out.println("Attendance percentage is "+percentage);
        if(percentage>=75)
            System.out.println("You are allowed to write the exam");
        else
            System.out.println("You are not allowed to write the exam");
        sc.close();
    }
}
