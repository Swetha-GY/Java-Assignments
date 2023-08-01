
//program to check if a given number is an Armstrong number or not:
 
   // Amstrong num ->
  //Ex. 371= (3*3*3)+(7*7*7)+(1*1*1) -> 27+343+1 -> 371.


public class ArmstrongNumChecker {
    public static void main(String[] args) {
        int num = 371;
        int originalNum = num;
        int result = 0;
        
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num /= 10;
        }
        
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }

}
