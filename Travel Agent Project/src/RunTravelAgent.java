import java.util.Scanner;
import java.util.ArrayList;

public class RunTravelAgent
	{
		static Scanner input = new Scanner(System.in);
		static ArrayList<Location> Trip = new ArrayList<Location>();
		static String name;
		static String enter;

		public static void main(String[] args)
			{
				introduction();
				fillArrayList();
				for(int i = 0; i < Trip.size(); i++)
					{
						System.out.println(Trip.get(i).getRegion());
					}
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
			Trip.add(new Location("North", "Michigan", "Isle Royale National Park", true, true, true, true));
			Trip.add(new Location("North", "South Dakota", "Mount Rushmore", true, true, true, true));
			Trip.add(new Location("North", "Wisconsin", "Milwaukee Art Museum", true, true, true, true));
			
			Trip.add(new Location("South", "Texas", "Alamo", true, true, true, true));
			Trip.add(new Location("South", "Florida", "Disney World", true, true, true, true));
			Trip.add(new Location("South", "Louisiana", "Bourbon Street", true, true, true, true));
			
			Trip.add(new Location("East", "Connecticut", "Mark Twain House", true, true, true, true));
			Trip.add(new Location("East", "Massachusetts", "Fenway Park", true, true, true, true));
			Trip.add(new Location("East", "New York", "Statue of Liberty", true, true, true, true));
			
			Trip.add(new Location("West", "California", "DisneyLand", true, true, true, true));
			Trip.add(new Location("West", "Oregon", "Oregon Dunes", true, true, true, true));
			Trip.add(new Location("West", "Washington", "Space Needle", true, true, true, true));
		}

	}
