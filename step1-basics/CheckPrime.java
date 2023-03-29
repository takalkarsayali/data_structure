import java.util.Scanner;
/*

Step 1.4: Know Basic Maths
Problem 7

*/
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        boolean ans = is_prime(n);
        if (ans == true && n != 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static boolean is_prime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

/*
 * Optimized Approach

  public static boolean isPrime(int N) {

    for (int i = 2; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;

  }
  public static void main(String args[]) {
    int n = 20;
    boolean ans = (isPrime(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non Prime Number");
    }
  }


 */