
public class FibonacciDP {

	public static void main(String[] args) {
		int  n=21;
		int arr[]=new int[n+2];
		System.out.println("fib is "+fib(n,arr));
	}

	public static int fib(int n,int[] arr ) {
		if (arr[n] != 0)
			return arr[n];
		else if (n <= 2)
			return 1;
		else {
			arr[n] = fib(n - 1,arr) + fib(n - 2,arr);
			return arr[n];
		}
	}
}
