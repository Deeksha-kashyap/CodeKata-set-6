import java.util.*;
class SolutionH
{
  static int superDigit(String n,int k)
  {  
	  long num=Integer.parseInt(n);
	  long num1=digit(num*k);
	  return num1;
  }
  static long digit(long n)
	{
        if(n<10)
		{
			return n;
		}
		else
		{
           int a=0;
		   while(n>0)
			{
			   a+=n%10;
			   n=n/10;
			}
			return digit(a);
		}
	}
  public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
	   String n=sc.next();
	   int k=sc.nextInt();
	   int c=superdigit(n,k);
	   System.out.println(c);
       
	}

} 


  
