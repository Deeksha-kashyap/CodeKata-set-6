import java.util.*;
public class LeapYear
{
    public static void main(String[] args)
    {
        int year;
        System.out.println("Enter the year");
        Scanner scan= new Scanner(System.in);
        year = scan.nextInt();
        if(((year % 4 == 0) && ( year % 100 != 0)) || ( year % 400 ==0))
        {
           System.out.println("This year is leap year");
        }
           else
        {
           System.out.println("This is not a leap year");
        }
    }
}
