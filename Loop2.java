
//program to print numbers between 1 and 100 that are divisible by 3, 5, or both

public class Loop2 {
        public static void main(String[] args) {
        for (int num=1; num<= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
            }
        }
    }

}
