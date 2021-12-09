import java.util.Scanner;
import java.util.ArrayList;
import java.util.ServiceLoader;



public class Booking {	
	
	
	private static Continent continent = new Continent();
	private static ArrayList<Country> countries = continent.getCountries();
	
	
	public static void addCountryMenu(Scanner input) {
		
	}
	
	
	public static void addDetailsMenu(Scanner input) {
		
	}
	
	
	/**
	 * Creating a function for the user input
	 * 
	 */
	public static void menu()
	{
		System.out.println("Welcome to the booking agency");
		System.out.println(" ");
		System.out.println("1. Add new conuntry to a continent !");
		System.out.println("2. Add details of a new  destination !");
		System.out.println("3. Get statisctics !");
		System.out.println("4. Exit");

	}
	
	
	/**
	 * Returns true if a country name is in the array;
	 * 
	 * 
	 * @param countries
	 * @param countryName
	 * @return
	 */
	 public static Boolean filter(ArrayList<Country> countries, String countryName) {
		
		boolean result = false;
		
		for( Country ct: countries) {
			if(ct.getCountryName()==countryName) {
				 result = true;
				 
			}
		}
		
		return result;
	}
	 
	 
	 
	 
	/**
	 * The main function of the booking class
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		  String[] str = null;
		  Scanner input = new Scanner(System.in);
		  
		  Continent continent = new Continent();
		  
		  Country countrie = null;
		  
		  /**
		   * Variables for Add Country
		   * 
		   */
		  String countryName = "";
		  String lang = "";
		  Boolean flag = false;
		  
		  /**
		   * Variables for Destination
		   * 
		   */
		  String name;
		  int capacity;
		  double latitude;		
		  double longitude;
		  
		 
		  /**
		   * Calling a function for the user menu
		   * 
		   */
		  menu();
		  switch (input.next())	{
			  case "1":
				  
				  //Adding a country 
				  System.out.println("Write a country name \n");
					countryName = input.next();
					

					System.out.println("Add language !");
					lang = input.next();
					

					System.out.println("What is the flag color ? type [ red or green ] ");
					String flagColor = input.next();				
					
					if(flagColor=="green") {
						flag = true;
					}else if(flagColor=="red") {
					    flag = false;
					}
					
					System.out.println("Are all the details correct ?" + countryName + " " + lang + " " + flagColor + "\n, Type [yes or no ]");
					
					if(input.nextLine()=="yes") {
						//cream tara 
						
						  continent.addCountry( countryName, lang, flag);
						
						  System.out.println(continent.getCountries().get(0).getCountryName());

						
						main(str);
						
					}else if(input.next()=="no") {
						
						main(str);
					}				
					
					//end add country 	
					
				  main(str);

				  input.reset();
				  System.out.println(input.next());
				  input.reset();
				  
			  case "2":
				  
				  //Adding a Destination and details 	
				  
					System.out.print("Type in a Country");
					System.out.println("");
					
//					if(!filter(countries, input.next())) {
//						System.out.println("The country selected is not avaiable! ");
//						main(str);
//					}
					
					
					System.out.println("Write the name of the Destination ");
					name = input.next();
					
					System.out.println("Write the capacity of the Destination \n");
					capacity = input.nextInt();
					
					System.out.println("Write the latitude of the Destination");
					latitude = input.nextDouble();
					
					System.out.println("Write the longitude of the Destination");
					longitude = input.nextDouble();
					
					System.out.println("Are all the details correct ?" + name + " " + capacity + " " + latitude + " " + longitude + "\n, Type [yes or no ]");
					
					if(input.nextLine()=="yes") {
						
						countrie.addDestination(name, capacity, latitude, longitude);
						System.out.println(countrie.getDestinations().get(0).getCapacity());
						
						main(str);
						
					}else if(input.nextLine()=="no") {
						
						main(str);
						
					}
					
					main(str);
					
					//end Destination	
			  case "3":
				  System.out.println("hi");
			  case "4":
				  System.exit(0);
					
		  	}
		  
		  
		  
		  
		  
	}
}

