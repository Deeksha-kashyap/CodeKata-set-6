import java.util.*;
class Sample
{
    static int checkeven(int n)
    {
       while(n>0)
       {
         if (((n % 10) % 2) > 0)  
            return 0; 
           n /= 10; 
       }
       return 1;
    }
    static int evenNo(int n) 
    {  
        for (int i = n;; i--) 
        if (checkeven(i) > 0) 
            return i; 
    } 
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=s.nextInt();
       System.out.println(evenNo(n));
    }
}
