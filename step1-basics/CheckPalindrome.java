import java.util.Scanner;
/*

Step 1.4: Know Basic Maths
Problem 3

*/
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        is_palindrome(n);
    }

    public static void is_palindrome(int n){
        int rnum = 0,r, num = n;
        while (n > 0){
            r = n % 10;
            rnum = (rnum*10)+r;
            n = n / 10; 
        }
        if(num == rnum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
