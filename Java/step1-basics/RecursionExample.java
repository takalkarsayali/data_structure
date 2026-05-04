public class RecursionExample{
    // printing numbers 1-100 using recursion

    static int n = 0;
    public static void print(){
        if(n == 101) return;
        System.out.print(n + " ");
        n += 1;
        print();
    }
    public static void main(String[]args){
        print();
        System.out.println();
    }
}