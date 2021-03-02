package assignments;

public class Pattern1_loops {
    public static void main(String[] args) {
        int space;
        for(int i=1;i<=5;i=i+2)
        {
            space=5-i;
            for(int k=0;k<space/2;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=0;k<space/2;k++)
                System.out.print(" ");
            System.out.println();
        }
        for(int i=3;i>=1;i=i-2)
        {
            space=5-i;
            for(int k=0;k<space/2;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=0;k<space/2;k++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
