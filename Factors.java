
//program to print the factors of 24 using a `while` loop:

public class Factors {
    public static void main(String[] args) {
        int num = 24;
        int divisor = 1;
        
        while (divisor <= num) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }

}
