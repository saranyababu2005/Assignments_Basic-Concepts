package assignments;

public class Armstrong_level2 {
    public static void main(String[] args) {
        int sum,rem,num;
        int cube=0;
        for(int i=100;i<=500;i++)
        {
            cube=0;
            num=i;
            do {
                rem=num%10;
                cube= (int) (cube + Math.pow(rem,3));
                num=num/10;
            }while(num>=10);
            cube= (int) (cube + Math.pow(num,3));
            if(i==cube)
                System.out.println("Armstrong number :"+i);

        }
    }
}
