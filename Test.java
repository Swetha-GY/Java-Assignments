import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
         Scanner s = new Scanner (System.in);
            int x= s.nextInt();
            String msg= x % 3==0 ? "Multiple of 3 " : "Not Multiple of 3" ; // Ternary operator
            System.out.println(msg);
        
    }
}
