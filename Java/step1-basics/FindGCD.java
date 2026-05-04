import java.util.Scanner;
/*

Step 1.4: Know Basic Maths
Problem 4

*/
public class FindGCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Solution 1: Using Brute Force Algorithm => " + brute_force_algo(num1,num2));
        System.out.println("Solution 2: Using Euclidean's Theorem => " + euclidean_thm(num1,num2));
    }

    //Solution 1: Using Brute Force Algorithm
    public static int brute_force_algo(int num1, int num2){
        int ans=1;
        for(int i = 1; i <= Math.min(num1, num2); i++){
            if(num1 % i == 0 && num2 % i == 0){
                ans = i;
            }
        }
        return ans;
    }

    // Solution 2: Using Euclidean Theorem
    public static int euclidean_thm(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return euclidean_thm(num2, num1 % num2);
    }
}
