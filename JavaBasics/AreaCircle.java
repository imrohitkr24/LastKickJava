import java.util.*;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius for the circle :");

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        float pi = 3.14f;

        float area = pi * r * r;

        System.out.println("Area of the circle is : " + area);
    }
}