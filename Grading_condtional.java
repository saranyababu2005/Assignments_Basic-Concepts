package assignments;

import java.util.Scanner;

public class Grading_condtional {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        marks=sc.nextInt();
        if(marks<=25)
            System.out.println("Your grade is F");
        else if((marks>25)&&(marks<=45))
            System.out.println("Your grade is E");
        else if((marks>45)&&(marks<=50))
            System.out.println("Your grade is D");
        else if((marks>50)&&(marks<=60))
            System.out.println("Your grade is C");
        else if((marks>60)&&(marks<=80))
            System.out.println("Your grade is B");
        else if(marks>80)
            System.out.println("Your grade is A");

        sc.close();
    }
}
