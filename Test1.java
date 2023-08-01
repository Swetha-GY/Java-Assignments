import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number:");
        
        Scanner s=new Scanner (System.in);

        int x = s.nextInt();
        
        if( (x>=100)&(x<=999))

           System.out.println(x+ "is a 3 digit number");
         
       else 
            System.out.println(x+ "is not a 3 digit number");
            
    }
}
