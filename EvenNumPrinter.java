
//program to read 5 numbers and print only the Even numbers or Odd numbers:
    
    import java.util.Scanner;

public class EvenNumPrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Enter 5 numbers:");
        while (count < 5) {
            int number = s.nextInt();
            
            //if (number % 2 == 0) {  // To print Even nos.
            if(number % 2 != 0) {    // To print Odd nos.
                
                //System.out.println("Even number: " + number); // Even num.
                System.out.println("Odd number: " + number);   //Odd num
            
            }

            count++;
        }
    }
}

