import java.util.*;
class Sample
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        System.out.print("Enter a another number:");
        int m=reader.nextInt();

        if((n*m)% 2 == 0)
            System.out.println(" even");
        else
            System.out.println(" odd");
    }
}
