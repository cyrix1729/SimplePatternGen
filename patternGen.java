import java.util.*;
class patternGen
{
	public static void main(String param[])
	{
		ask();
		System.exit(0);


	}

	public static void ask()
	{
		int width = inputint("Enter the width");
		int height = inputint("Enter the height");
		int stripe = inputint("How often should the stripes appear?");

		flag(width, height, stripe);
	}
	public static void flag(int width, int height, int stripe)
	{
		for(int i =0;i<height;i++)
		{
			width(width, stripe);
			println("");
		}
	}

	public static void width(int width, int stripe)
	{
		for(int j =0;j<width;j++)
			{
				line(width, stripe);
			}
	}

	public static void line(int width, int stripe)
	{
			for(int k =0;k<stripe;k++)
				{
					print('O');
				}
				print('*');
	}
	/**************************************************
	Input Methods - These methods are used to take
	input from the userm and return the values so that
	they can be used in other methods.
	**************************************************/

		public static int inputint(String message) // takes integer-type values
		{
			String answer0;
			Scanner scanner = new Scanner(System.in);
			System.out.println(message);
			answer0 = scanner.nextLine();
			int answer = Integer.parseInt(answer0);

			return answer;
		}

	/*************************************************
	Print methods - these are for printing String/int
	values. They are defined here and can be used in other
	methods.
	**************************************************/
		public static void println(String message)//to print a String
		{
				System.out.println(message);
		}

		public static void print(char message)//to print an integer-value
		{
				System.out.print(message);

		}
	/*************************************************
	END of input and print methods
	**************************************************/
}
