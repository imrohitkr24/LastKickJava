import java.util.*;
public class Grade{
    public static void main(String[]args){
        System.out.println("Enter the Grade :");
        Scanner sc = new Scanner(System.in);
        int Grade = sc.nextInt();
        

        if (Grade < 0 || Grade > 100) {
    System.out.println("Invalid Marks");
}
else if (Grade >= 90) {
    System.out.println("Grade A");
}
else if (Grade >= 80) {
    System.out.println("Grade B");
}
else if (Grade >= 70) {
    System.out.println("Grade C");
}
else if (Grade >= 60) {
    System.out.println("Grade D");
}
else if (Grade >= 40) {
    System.out.println("Grade E");
}
else {
    System.out.println("Grade F");
}
    }
}

//time and space complexity is O(1)