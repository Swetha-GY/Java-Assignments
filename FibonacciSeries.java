
//Java program to print the Fibonacci number series up to a given number (17 in this example):

public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 17;
        int firstNum = 0;
        int secondNum = 1;
        
        System.out.print("Fibonacci series up to " + limit + ": ");
        System.out.print(firstNum +" " +secondNum + " " );
        
        int nextNum;
        while ((nextNum = firstNum + secondNum) <= limit) {
            System.out.print(nextNum +" ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

}
