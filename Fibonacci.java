import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        int a,b,c,n;
        boolean lengthCorrect = true;
        a=0;
        b=1;
        n = 0;
        
        Scanner sc = new Scanner(System.in);
        
        // Check that the number is lower then 40, because INT will not support higher
        while(lengthCorrect) {
           System.out.println("Enter a number under 40 how long it should be?");
           n = sc.nextInt();
           // If the length is under 40, get out of loop
           if (n < 40) { lengthCorrect = false; }
        }
        
        // print the first 2 numbers in the fibonacci.
       System.out.print(a+ ", "+b + ", ");
       
       // We remove the first 2 from the length becuase we set them above.
       for(int i=0; i<n-2;i++) {
           c=a+b;
           // Print each new number
           System.out.println(c);
           // Store the last number
           a=b;
           b=c;        
       }
    }
    
}
