import java.util.*;
public class PoNeZe{
    public static void main(String[]args){
        System.out.println("Enter the Number to Check : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0){
         System.out.println("Postive Number : " +a);
        }else if(a<0){
            System.out.println("Negative Number : " +a);
        }else{
            System.out.println("Zero : " +a);
        }
    }
}
//Time and Space Complexity is O(1)