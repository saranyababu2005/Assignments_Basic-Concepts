package assignments;

import java.util.Scanner;

public class Oldest_conditional {
    public static void main(String[] args) {
        int age1,age2,age3;
        int oldest,youngest,tempold,tempyoung;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age 1, age 2, age 3 values");
        age1=sc.nextInt();
        age2=sc.nextInt();
        age3=sc.nextInt();
        tempold=(age1>age2)?age1:age2;
        oldest=(tempold>age3)?tempold:age3;
        System.out.println("Oldest of 3 is "+ oldest);
        tempyoung=(age1<age2)?age1:age2;
        youngest=(tempyoung<age3)?tempyoung:age3;
        System.out.println("Youngest of 3 is "+youngest);

        sc.close();
    }
}
