import java.util.Scanner;

public class Main {
	
	public static final int SIZE = 720;
	public static int[] array = new int[SIZE];
	public static boolean[] sequence = new boolean[SIZE];
	public static int counter = 0;
	public static int time = 1200;
	public static int a = 0;
	public static int b = 0;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int D = input.nextInt();
		int counter = D/720*31;
		D = D%720;
		
		for(int x = 0; x < 720; x++)
		{
			digitSeparation();
			if(a <= 58)
				time++;
			else if(b == 12)
				time = 100;
			else
				time = time + 41;
			array[x] = time;
			
		}
		SequenceCheck();
		for(int x = 0; x < D; x++)
		{
			
			if(sequence[x] == true)
				counter++;
		}
		
		System.out.println(counter);
	}
	public static void digitSeparation()
	{
		int timeCopy = time;
		a = timeCopy % 100;
		timeCopy = timeCopy/100;
		b = timeCopy % 100;
		timeCopy = timeCopy/100;
		
	}
	public static void SequenceCheck()
	{
		for(int x = 0; x < SIZE; x++)
		{
			int number = array[x];
			
			if(number >= 1000)
			{
				int d = number%10;
				number = number/10;
				int c = number%10;
				number = number/10;
				int b = number%10;
				number = number/10;
				int a = number%10;
				number = number/10;
				if(a - b == b - c && b - c == c - d)
					sequence[x] = true;
				else
					sequence[x] = false;
			}
			else
			{
				int c = number%10;
				number = number/10;
				int b = number%10;
				number = number/10;
				int a = number%10;
				number = number/10;
				if(a - b == b - c)
					sequence[x] = true;
				else
					sequence[x] = false;
			}
			
	}

}
}
