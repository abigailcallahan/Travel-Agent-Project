import java.util.Scanner;
import java.util.ArrayList;

public class RunTravelAgent
	{
		static Scanner input = new Scanner(System.in);
		static ArrayList<Location> Trip = new ArrayList<Location>();
		static String name;
		static String enter;
		static String askRegion;
		static String getRegion;
		static int counter = 0;
		static String askState;
		static String getState;
		static int index;
		static String askPool;
		static String askSeason;
		static String askFamily;
		static String askCity;

		public static void main(String[] args)
			{
				introduction();
				fillArrayList();
				askAboutRegion();
				askAboutState();
				displaySoFar();
				pool();
				season();
				family();
				city();
				sumAllUp();
				sumAllUpMinorDetails();
				conclusion();
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

		public static void askAboutRegion()
		{
			System.out.println("First, do you want to travel in the South, North, East, West?");
			askRegion = input.nextLine();
			for(int i = 0; i < Trip.size(); i++)
				{
					if(askRegion.equals(Trip.get(i).getRegion()))
						{
							getRegion = Trip.get(i).getRegion();
						}
				}
			System.out.println("Okay you are going to travel in the " + askRegion);
		}
	
		public static void askAboutState()
		{
			System.out.println("\nSo there are three options of states that you can choose in the " + getRegion);
			System.out.println("Press enter to display these options along with their landmarks");
			enter = input.nextLine();
			for(int i = 0; i < Trip.size(); i++)
				{
					if(Trip.get(i).getRegion().equals(getRegion))
						{
							System.out.println((counter + 1) + ") " + Trip.get(i).getState() + " with the landmark of " + Trip.get(i).getLandmark());
							counter++;
						}
				}
			System.out.println("\nGo ahead and pick the STATE that you want to visit (with the landmark in mind) (correctly capitalize the state!)");
			askState = input.nextLine();
			for(int i = 0; i < Trip.size(); i++)
				{
					if(askState.equals(Trip.get(i).getState()))
						{
							getState = Trip.get(i).getState();
						}
				}
		}
		
		public static void displaySoFar()
		{
			System.out.println("\nOk so far you want to travel in the " + getRegion + " and you want to go to " + getState);
			for(int i = 0; i < Trip.size(); i++)
				{
					if(Trip.get(i).getState().equals(getState))
						{
							index = i;
						}
				}
			System.out.println("In " + getState + " the major landmark you are going to visit is " + Trip.get(index).getLandmark());
		}
		
		public static void pool()
		{
			System.out.println("Press enter to continue our travel plan");
			enter = input.nextLine();
			System.out.println("Let's make a couple minor decisions");
			System.out.println("Do you want to stay at a place where there is a pool?");
			System.out.println("1)yes \n2)no");
			askPool = input.nextLine();
			if(askPool.equals("1"))
				{
					System.out.println("Ok you do want a pool, it is very relaxing!!");
					Trip.get(index).setHavePool(true);
				}
			else if(askPool.equals("2"))
				{
					System.out.println("Ok you DO NOT want a pool");
					Trip.get(index).setHavePool(false);
				}
			
		}

		public static void season()
		{
			System.out.println("\nNext: do you want to travel in the winter or summer? \n1) winter \n2) summer");
			askSeason = input.nextLine();
			if(askSeason.equals("1"))
				{
					System.out.println("To recap: you want to travel in the winter so around October-March");
					Trip.get(index).setWinter(true);
				}
			else if(askSeason.equals("2"))
				{
					System.out.println("To recap: you want to travel in the summer so around April-September");
					Trip.get(index).setWinter(false);
				}
		}
		
		public static void family()
		{
			System.out.println("\nNow, do you have family in " + getState + "?");
			System.out.println("1) yes \n2) no");
			askFamily = input.nextLine();
			if(askFamily.equals("1"))
			{
				System.out.println("Ok we will add visit family to the itinerary!");
				Trip.get(index).setHaveFamily(true);
			}
			else if(askFamily.equals("2"))
			{
				System.out.println("No family visiting for you then!!");
				Trip.get(index).setHaveFamily(false);
			}
			
		}
		
		public static void city()
		{
			System.out.println("Press enter to do the final steps of your travel plan");
			enter = input.nextLine();
			System.out.println("Finally, do you want to stay in the city or the suburbs?");
			System.out.println("1) city \n2) suburbs");
			askCity = input.nextLine();
			if(askCity.equals("1"))
			{
				System.out.println("Staying in the city gives a great idea of what city life is like. Good Choice!");
				Trip.get(index).setInCity(true);
			}
			else if(askCity.equals("2"))
			{
				System.out.println("Staying the Suburbs allows you to have some peace but also not be too far from the cty. Great Choice!");
				Trip.get(index).setInCity(false);
			}
		}
	
		public static void sumAllUp()
		{
			System.out.println("Let's sum up your trip and finalize the details!");
			System.out.println("Go ahead and press enter so I can give you your final travel plan itinerary");
			enter = input.nextLine();
			System.out.println("1) You are traveling to the " + getRegion);
			System.out.println("2) Within the " + getRegion + ", you are going to the wonderful state of " + getState);
			System.out.println("3) In " + getState + " you are visiting the popluar landmark of " + Trip.get(index).getLandmark());
			System.out.println("\nNow for the minor details:");
		}
		
		public static void sumAllUpMinorDetails()
		{
			if(Trip.get(index).havePool() == true)
				{
					System.out.println("4) You are going to stay in a place that has a pool");
				}
			else 
				{
					System.out.println("4) You are not interested in staying in a place that has a pool");
				}
			
			if(Trip.get(index).isWinter() == true)
				{
					System.out.println("5) You are going to be on vacation during the Winter months");
				}
			else
				{
					System.out.println("5) You are going to be on vacation during the Summer months");
				}
			
			if(Trip.get(index).isHaveFamily() == true)
				{
					System.out.println("6) You have family in " + getState + " so you are going to be visiting them");
				}
			else
				{
					System.out.println("6) You do not have family in " + getState + " so you are not visiting family");
				}
			
			if(Trip.get(index).isInCity() == true)
				{
					System.out.println("7) Finally, you want to stay in the city. ");
				}
			else
				{
					System.out.println("7) Finally, you want to stay in the suburbs");
				}
			
		}
	
		public static void conclusion()
		{
			System.out.println("Press enter if this plan looks great");
			enter = input.nextLine();
			System.out.println("I hope that you had fun planning your trip, " + name);
			System.out.println("See you next time!!");
		}
	}





