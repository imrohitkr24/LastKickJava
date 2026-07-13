import java.util.*;
public class Leap{
    public static void main(String[]args){
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0&& year%100!=0||(year%400==0)){
            System.out.println("Year is Leap Year :" +year);
        }else{
            System.out.println("Year is Not Leap year :" +year);
        }
    }
}
//Time and Space complexity is O(1)