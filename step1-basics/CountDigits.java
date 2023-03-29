import java.util.Scanner;

/*

Step 1.4: Know Basic Maths
Problem 1

*/
public class CountDigits{

	// Method 1
	public static int count_digits(int n){
		int x = n, count = 0;
		while(x != 0){
		x = x/10;
		count++;
	}
		return count;
}

	//Method 2
	public static int count_digits2(int n){
		String str = Integer.toString(n);
		return str.length(); 
	}
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("The number of digits in number " + n + " are " + count_digits(n));
		System.out.println("The number of digits in number " + n + " are " + count_digits2(n));
	}
}
