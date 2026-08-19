import java.util.*;
public class Product{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while(n>0){
            int digit = n%10;
            product *= digit;
            n = n/10;
        }
        System.out.println("Product is : " +product);
    } 
}
//Time complexity is O(log n);
//Space complexity is O(1);