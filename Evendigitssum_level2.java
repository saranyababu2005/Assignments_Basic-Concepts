package assignments;

import java.util.Scanner;

public class Evendigitssum_level2 {
    public static void main(String[] args) {
        int length,num,num1,counter=-1,evensum=0,oddsum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of digits");
        length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter the number");
        num=sc.nextInt();
        num1=num;
        do {
            counter++;
            arr[counter]=num1%10;
            num1=num1/10;
        }while(num1>=10);
            arr[++counter]=num1;
        for(int i=0;i<=counter;i=i+2)
        {
            evensum=evensum+arr[i];
        }
        for(int i=1;i<=counter;i=i+2)
        {
            oddsum=oddsum+arr[i];
        }
        System.out.println("Sum of even digits "+ evensum);
        System.out.println("Sum of odd digits "+oddsum);

        sc.close();
    }
}
