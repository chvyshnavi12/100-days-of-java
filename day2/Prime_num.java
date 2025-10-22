import java.util.Scanner;

public class Prime_num {

    public static boolean isprime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // check divisibility up to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // not prime
            }
        }

        return true; // prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("Prime numbers up to " + num + " are:");
        for (int i = 2; i <= num; i++) { // start from 2 (first prime)
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // new line at the end
    }
}
