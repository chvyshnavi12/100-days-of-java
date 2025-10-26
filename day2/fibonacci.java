import java.util.Scanner;

class fibonacci {
    public static int fib(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Fibonacci series up to " + num + " terms: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}
