import java.util.*;
class Sample
{
    public static boolean isStringOnlyAlphabet(String str) 
    { 
        if (str == null || str.equals("")) 
        { 
            return false; 
        } 
        for (int i = 0; i < str.length(); i++)
        { 
            char ch = str.charAt(i); 
            if ((!(ch >= 'A' && ch <= 'Z')) && (!(ch >= 'a' && ch <= 'z')))
            { 
                return false; 
            } 
        } 
        return true; 
    } 
    public static void main(String[] args)
    {
        String str = "soni1994";  
        System.out.println("Output: " + isStringOnlyAlphabet(str)); 
    }
}
