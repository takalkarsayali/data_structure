public class Print1toN {
    static int count = 0;

    public static void printNumbers(int n) {
        if (count > n)
            return;
        System.out.print(count + " ");
        count++;
        printNumbers(n);
    }

    public static void main(String[] args) {
        printNumbers(100);
    }
}
