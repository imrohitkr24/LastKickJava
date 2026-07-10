import java.util.*;
public class Greater{
    public static void main(String[]args){
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(a>b){
            System.out.println("Greater is " +a);
        }else{
            System.out.println("Greater is " +b);
        }
    }
}
//Time and space complexity is O(1)