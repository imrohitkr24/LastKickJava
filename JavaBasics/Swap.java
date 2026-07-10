import java.util.*;
public class Swap{
    public static void main(String[]args){
        System.out.println("Enter the Number for Swap");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = sc.nextInt();
        //Opiton 1
        // a=a^b;
        // b=a^b;
        // a=a^b;
        //Option 2
        //   a = a+b;
        //   b = a-b;
        //   a = a-b;
        // Option 3
           int temp =a;
           a=b;
           b=temp;

        System.out.println("A ="+a + " B =" + b);
    }
}
//Time and Space Complexity is O(n)