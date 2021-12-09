import java.util.ArrayList;

public class Continent {
	
	private ArrayList countries = new ArrayList<Country>();
	
	private ArrayList<String> continents = new ArrayList<String>();
	
	private String continentName;
	
	
	/**
	 * 
	 * @param continentName
	 */
//	public Continent(String continentName)
//	{		
//		this.setContinent(continentName);
//	}
	
	/**
	 * 
	 * @param continentName
	 * @return
	 */
	public String getContinent(String continentName)
	{
		String result = "";
		
		for(String continent: continents)
		{
			if(continent == continentName)
			{
				result = continent;
			}			
		}
		
		return result;
	}
	
	
	/**
	 * 
	 * @param continentName
	 */
	public void setContinent(String continentName)
	{		
		this.continentName = continentName;
		if(continentName != "")
		{
			this.continents.add(this.continentName);
		}
		
	}	
	
	/**
	 * 
	 * @return
	 */
	public int getAverageCapacity() 
	{
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getHighestCapacity()
	{
		return 0;
	}
	
	/**
	 * 
	 * @param capacity
	 * @return
	 */
	public ArrayList<Country> getCountry(int capacity)
	{		
		return countries;
	}
	
	/**
	 * 
	 * @param name
	 * @param language
	 * @param flag
	 */
	public void addCountry(String name, String language, Boolean flag) 
	{
		Country country = new Country(name, language, flag);
		this.countries.add(country);
		
		System.out.println("bagata ");
	}
	
	/**
	 * Returns the whole array of countries	
	 * @return
	 */
	public ArrayList<Country> getCountries()
	{
		return this.countries;
	}
	
}
