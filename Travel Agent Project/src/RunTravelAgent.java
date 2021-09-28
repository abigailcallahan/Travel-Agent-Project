import java.util.Scanner;

public class RunTravelAgent
	{
		static Scanner input = new Scanner(System.in);
		static String name;
		static String enter;

		public static void main(String[] args)
			{
				introduction();
			}
		
		
		public static void introduction()
		{
			System.out.println("Welcome to the travel planning agency");
			System.out.println("I will be planning your trip...what is your name?");
			name = input.nextLine();
			System.out.println("Nice to meet you, " + name);
			System.out.println("Let's start the planning! Press enter to start the process");
			enter = input.nextLine();
		}
		
		public static void fillArrayList()
		{

		}
		
		public static void startGame()
		{
			
		}

	}
