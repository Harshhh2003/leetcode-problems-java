import java.util.Scanner;

public class uglynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
   if (isUgly(n)) {
            System.out.println(n + " is an ugly number.");
        } else {
            System.out.println(n + " is not an ugly number.");
        }
    sc.close(); 
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;

     
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

    
        return n == 1;
    }
}
