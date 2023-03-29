import java.util.Scanner;

/*

Step 1.4: Know Basic Maths
Problem 6

*/

public class PrintDivisors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        print_divisors(n);
    }

    public static void print_divisors(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
