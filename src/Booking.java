import java.util.Scanner;
import java.util.ArrayList;
import java.util.ServiceLoader;



public class Booking {	
	
	
	private static Continent continent = new Continent();
	private static ArrayList<Country> countries = continent.getCountries();
	
	
	public static void addCountryMenu(Scanner input) {
		String[] str = null;
		
		
		String countryName = "";
		String lang = "";
		Boolean flag = false;
		
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
			
			main(str);
		}else if(input.next()=="no") {
			main(str);
		}
		
	}
	
	
	public static void addDetailsMenu(Scanner input) {
		String[] str = null;
		
		String name;
		int capacity;
		double latitude;		
		double longitude;
		
		
		System.out.print("To what country belongs to destination? ");
		System.out.println("");
		
		if(!filter(countries, input.next())) {
			System.out.println("The country selected is not avaiable! ");
			main(str);
		}
		
		
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
			//cream
			main(str);
		}else if(input.nextLine()=="no") {
			main(str);
		}
	}
	
	
	
	public static void menu()
	{
		System.out.println("Welcome to the booking agency");
		System.out.println(" ");
		System.out.println("1. Add new conuntry to a continent !");
		System.out.println("2. Add details of a new  destination !");
		System.out.println("3. Get statisctics !");

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
	
	public static void main(String[] args) 
	{
		  String[] str = null;
		  Scanner input = new Scanner(System.in);
		 

		  
//		  seed();
		  
		  menu();
		  switch (input.next())	{
			  case "1":
				  addCountryMenu(input);
				  menu();

				  input.reset();
				  System.out.println(input.next());
				  input.reset();
			  case "2":
				  addDetailsMenu(input);
				  menu();			  
		  }
		  
		  
		  
		  
		  
	}
}

