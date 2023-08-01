
//program to find the largest prime factor of a number:

public class Loop3 {
    public static void main(String[] args) {
        long num= 13195;
        long largestPrimeFactor = 2;
        
        while (num > 1) {
            if (num % largestPrimeFactor == 0) {
                num /= largestPrimeFactor;
            } else {
                largestPrimeFactor++;
            }
        }
        
        System.out.println("Largest prime factor: " + largestPrimeFactor);
    }

}
