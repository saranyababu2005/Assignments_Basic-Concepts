package assignments;

import java.util.Scanner;

public class Medical_conditional {
    public static void main(String[] args) {
        int percentage;
        int noclassheld,noclassattended;
        char medical;
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
        {
            System.out.println("Do you have any medical reasons.Say 'Y' if yes , 'N' if No");
            medical=sc.next().charAt(0);
            if(medical=='Y')
                System.out.println("You are allowed to write the exam");
            else if(medical=='N')
                System.out.println("You are not allowed to write the exam");
        }

        sc.close();
    }
}
