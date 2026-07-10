//Quotient and Remainder
import java.util.*;
public class RemQue{
    public static void main(String[]args){
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Ouotient : " + a/b);
        System.out.println("Remainder : " +  a%b);
    }
}