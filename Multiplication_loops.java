package assignments;

public class Multiplication_loops {
    public static void main(String[] args) {
        int arr[]=new int[]{24,50,29};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.println(arr[i]+"*"+j+"="+arr[i]*j);
            }
            System.out.println("----");
        }
    }
}
