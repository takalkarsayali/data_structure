/*

Step 1.4: Know Basic Maths
Problem 7

*/

public class ArmstrongNumber {
    static boolean isArmstrongNumber(int n) {
        int originalno = n;
        int count = 0;
        int temp = n;
        
        //counting number of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        
        int sumofpower = 0;
        while (n != 0) {
            int digit = n % 10;
            sumofpower += Math.pow(digit, count);
            n /= 10;
        }
        return (sumofpower == originalno);
    }

    public static void main(String args[]) {
        int num = 153;
        if (isArmstrongNumber(num)) {
            System.out.println("Yes, it is an Armstrong Number\n");
        } else {
            System.out.println("No, it is not an Armstrong Number\n");
        }

    }
}