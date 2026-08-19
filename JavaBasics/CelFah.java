import java.util.*;
public class CelFah{
    public static void main(String[]args){
        System.out.println("Enter the temperature : ");
        Scanner sc = new Scanner (System.in);
        double cel = sc.nextDouble();
        double fah = (cel*9/5)+32;

        System.out.println("Celsius to Fahrenheit : " +fah);
    }
}
//Time and Space Complexity is O(1)
//Fah to cel 
//C=(F-32)*5/9

//int C = (F-32)*5/9;