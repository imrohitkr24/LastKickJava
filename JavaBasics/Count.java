import java.util.*;
public class Count{
    public static void main(String[]args){
        System.out.println("Enter the Number for the count");
        Scanner sc = new Scanner (System.in);
        int n = sc .nextInt();
        int count =0;
        while (n>0){
            //int digit = n%10;
            n = n/10;
            count ++;
        }
        System.out.println(count);
    }
}
//Time is O(logn) and space complexity is O(1)