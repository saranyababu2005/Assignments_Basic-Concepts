package assignments;

public class Pattern2_loops {
    public static void main(String[] args) {
        int space;
        for(int i=7;i>=1;i=i-2)
        {
            space=7-i;
            for(int k=0;k<space/2;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            for(int k=0;k<space/2;k++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
