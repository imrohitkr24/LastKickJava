import java.util.*;
public class PerimeterRec{
    public static void main(String [] args){
        System.out.println("Enter the length and Breadth :");
        Scanner sc = new Scanner (System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of the Rectangle is : " +perimeter);
    }
}
//Time and Space Complexity is O(1);