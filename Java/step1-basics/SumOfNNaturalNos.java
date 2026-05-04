public class SumOfNNaturalNos {

	static void solve1(int n, int sum) {
		if (n < 1) {
			System.out.println("The sum of numbers is: " + sum);
			return;
		}

		solve1(n - 1, sum + n);

	}

	public static void solve2(int n) {
		int sum = n * (n + 1) / 2;
		System.out.println("The sum of the first " + n + " numbers is: " + sum);
	}

	public static void solve3(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The sum of the first " + n + " numbers is: " + sum);
	}

	public static void main(String[] args) {
		solve1(6,0);
		solve2(6);
		solve3(6);
	}
}