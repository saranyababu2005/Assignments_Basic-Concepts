package assignments;

import java.util.Scanner;

public class PlaceOfService_level2 {
    public static void main(String[] args) {
        int age;
        char gender;
        char marital;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter Gender");
        gender=sc.next().charAt(0);
        if(gender=='F')
            System.out.println("She will work only in urban areas");
        else if((gender=='M') && (age>20) && (age<40))
            System.out.println("He may work anywhere");
        else if((gender=='M') && (age>40) && (age<60))
            System.out.println("He will work in urban areas only");
        else
            System.out.println("Error");
        sc.close();
    }
}
