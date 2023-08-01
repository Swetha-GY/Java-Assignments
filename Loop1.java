
//program to print the first 5 values that are divisible by 2, 3, and 5:

public class Loop1 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        
        while (count < 5) {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}

