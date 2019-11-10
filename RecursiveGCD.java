// Java program to find GCD of two numbers 
class RecursiveGCD
{ 
    static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
    public static void main(String[] args)  
    { 
        int a = 10, b = 5; 
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b)); 
    } 
} 