import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int sum = n;
		for(int x = 1; x <= k ; x++)
			sum = (int) (sum + (n * Math.pow(10, x)));
		System.out.println(sum);
	}
	
}
