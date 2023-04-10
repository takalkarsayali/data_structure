public class PrintNameNtimes {

    static int count = 0;
    static void printName(int n){
        if(count > n) return;
        System.out.print("Sayali ");
        count++;
        printName(n);
    }
    public static void main(String[]args){
        printName(10);
        System.out.println();
    }
}
