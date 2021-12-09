import java.util.ArrayList;

public class Country {
	
	private String countryName = "";
	
	private String language = "";
	
	private Boolean flag; 
	
	private ArrayList<Destination> destinations = new ArrayList<Destination>();
	
	
	/**
	 * 
	 * @param countryName
	 * @param language
	 * @param flag
	 */
	public Country(String countryName, String language, Boolean flag)
	{
		this.setCountryName(countryName);
		this.setLanguage(language);
		this.setFlag(flag);
	}
	
	
	/**
	 * creates a new destination instance and populates the values 
	 * 
	 * @param name
	 * @param capacity
	 * @param latitude
	 * @param longitude
	 */
	public void addDestination(String name, int capacity, double latitude, double longitude) 
	{
		Destination dest = new Destination();

		dest.setName(name);
		dest.setCapacity(capacity);
		dest.setLatitude(latitude);
		dest.setLongitude(longitude);		
	
		this.destinations.add(dest);
		
	}
	
	 
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Destination> getDestinations()
	{
		return this.destinations;
	}	
	
	
	
	/**
	 * 
	 * @return
	 */
	public String getCountryName()
	{
		return this.countryName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLanguage()
	{
		return this.language;
	}
	
	/**
	 * This method returns green if the value is true, otherwise returns red
	 * 
	 * @return
	 */
	public String getFlag() 
	{
		String flag = "green";
		
		if(this.flag == false) {
			flag = "red";
		}
		
		return flag;
			
	}
	
	/**
	 * 
	 * @param newCountryName
	 */
	public void setCountryName(String newCountryName)
	{
		this.countryName = newCountryName;
	}
	
	/**
	 * 
	 * @param newLanguage
	 */
	public void setLanguage(String newLanguage)
	{
		this.language = newLanguage;
	}
	
	/**
	 * 
	 * @param flag
	 */
	public void setFlag(Boolean flag)
	{
		this.flag = flag;
	}	
	
	
		
	
	
}
