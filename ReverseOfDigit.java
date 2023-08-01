public class ReverseOfDigit {
        public static void main(String[] args) {
        int

 number = 123456789;
        int reversedNum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversedNum);
    }

}
