import java.util.*;
class Sample
{
    public static void main(String[] args)
    {
        int c=0,n=584;
        while(n!=0)
        {
           n/=10;
           c++;
        }
        System.out.println("Number of digits" + c);
    }
}
