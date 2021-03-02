package assignments;

import java.util.Scanner;

public class Lowercase_conditional {
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
        if(Character.isUpperCase(c))
            System.out.println("Given character is UpperCase");
        else
            System.out.println("Given character is LowerCase");

        sc.close();
    }
}
