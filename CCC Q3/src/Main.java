import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int t = input.nextInt();
		int travel = Math.abs(a - c) + Math.abs(b - d);
		if(t - travel < 0)
			System.out.println("N");
		else if ((t - travel) % 2 == 0)
			System.out.println("Y");
	
		else
			System.out.println("N");

	}

}
