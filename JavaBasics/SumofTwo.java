// SumOfTwo Number array basics


 import java.util.*;
 public class SumofTwo{
     public static void main(String[]args){
         System.out.println("Enter the Number:");
         Scanner sc = new Scanner(System.in);
       
         int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is "  + (a+b));
            System.out.println("Diff is " + (a-b));
            System.out.println("Product is "  + (a*b));
    }
 }
//Time and Space complexity is O(1)
