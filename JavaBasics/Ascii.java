import java .util.*;
public class Ascii{
    public static void main(String[]args){
        System.out.println("Enter the value for which you  have to take Ascii value :");
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().charAt(0);

        System.out.println((int)ch);
    }
}
//int Num = sc.nextInt();
//System.out.println((char) num);
//time and space complexity is O(1);