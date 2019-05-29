import java.util.*;
class Sample
{
    public static void main(String[] args)
    {
       int[] n={1,2,3,4,5,6,7,8,9};
       int k=5;
       boolean found=false;
       for (int num : n) {
            if (num == k) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(k + " is found.");
        else
            System.out.println(k + " is not found.");
    }
}
