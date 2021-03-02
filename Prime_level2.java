package assignments;

public class Prime_level2 {
    public static void main(String[] args) {
        int flag=0;
        for(int i=1;i<=100;i++)
        {
            flag=0;
            for(int j=2;j<=(i/2);j++)
            {
                if((i%j)==0)
                    flag=1;
            }
            if(flag==0)
                System.out.println(i +" is a prime number");
        }
    }
}
