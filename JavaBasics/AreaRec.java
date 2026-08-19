import java.util.*;
public class AreaRec{
    public static void main(String[]args){
        System.out.println("Enter the Length and Breath For the Area :");
        Scanner sc = new Scanner (System.in);
        int Length = sc.nextInt();
        int Breath = sc.nextInt();
        int Area = (Length*Breath);

        System.out.println("Area of Rectangle : " + Area +
        " Cm");
    }
}
//Time and Space Complexity is O(1)