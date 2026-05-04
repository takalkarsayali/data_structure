public class PrintNto1{

    public static void printNumbers(int n,int i) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        printNumbers(n, i-1);
    }

    public static void main(String[] args) {
        printNumbers(100,100);
    }
}
