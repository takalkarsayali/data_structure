import java.util.Scanner;

public class CheckPalindromeString {

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);

            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else
                left++;
            right--;
        }
        return true;
    }

    static boolean palindrome(int i, String s) {

        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are compared, we return true.
        if (i >= s.length() / 2)
            return true;

        // If start is not equal to end, not palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        // If both characters are same, increment i and check start+1 and end-1.
        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String here: ");
        String str = sc.nextLine();
        boolean ans = isPalindrome(str);

        if (ans == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(palindrome(0,str));
    }
}