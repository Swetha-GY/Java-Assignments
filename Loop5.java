
//program to print odd and even numbers from 1 to 10 using a `for` loop:

public class Loop5 {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            
            //if (number % 2 != 0) {       // to print Odd nos.
            if(number % 2 == 0){         // to print Even nos.
            
                System.out.println(number);
            
            }
        }
    }

}
