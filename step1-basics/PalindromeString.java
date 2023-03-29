public class PalindromeString {
    static int isPalindrome1(String S) {
        // code here
        S = S.replaceAll("\\s", "");
        // S = S.replaceAll(",", "");
        // S = S.replaceAll(":", "");
        S = S.toLowerCase();
        for (int i = 0, j = S.length() - 1; i <= j; i++, j--) {
            if (S.charAt(i) != S.charAt(j)) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPalindrome(String s) {
        // s = s.replaceAll("\\W", "");
        // s = s.replaceAll("_", "");
        // s = s.toLowerCase();
        // for(int i = 0, j = s.length()-1; i <= j; i++,j--){
        // if(s.charAt(i) != s.charAt(j)){
        // return false;
        // }
        // }
        // return true;

        s = s.replaceAll("\\W", "");
        s = s.replaceAll("_", "");
        s = s.toLowerCase();
        System.out.println(s);
        int start = 0;
        // String ans = s.replaceAll("\\W", "");
        // ans = ans.replaceAll("_", "");
        // ans = ans.toLowerCase();
        // System.out.println(ans);
        // int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
