import java.util.*;
public class OddEven{
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();

        if(a%2==0){
            System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        }
    }
//Time and Space complexity is O(1)