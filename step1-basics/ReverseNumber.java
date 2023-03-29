import java.util.Scanner;
/*

Step 1.4: Know Basic Maths
Problem 2

*/
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Reversed Number: " + reverse_num(n));
    }

    private static int reverse_num(int n) {
        int num = 0, r;
        while(n>0){
            r = n % 10;
            num = (num*10)+r;
            n = n/10;
        } 
        return num;
    }
}
