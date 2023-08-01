
//program to print the multiplication table of 6 using a `while` loop:

public class MulTable {
        public static void main(String[] args) {
        int num = 6;
        int multiplier = 1;
        
        while (multiplier <= 10) {
            int result = num * multiplier;
            System.out.println(num + " * " + multiplier + " = " + result);
            multiplier++;
        }
    }

    
}
