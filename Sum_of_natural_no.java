import java.util.*;
class Sample
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int k,sum=0,i=1;
       System.out.println("Enter the number");
       k=s.nextInt();
       while(i<=k)
       {
          sum=sum+i;
          i++;
       }
        System.out.println("Sum of "+k+" numbers is :"+sum);
    }
}
