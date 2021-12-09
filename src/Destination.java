import java.util.ArrayList;
import java.util.Collections;

public class Destination {

	
	/**
	 * name of the country
	 */
	private String name = "";	
	
	/**
	 * How many tourists are allowed after covid
	 */
	private int capacity = 0;
	
	private double latitude=0;
	
	private double longitude=0;
	
	
	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCapacity()
	{
		return this.capacity;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getLatitude()
	{
		return this.latitude;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getLongitude()
	{
		return this.longitude;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Double> getCoordinates()
	{
		ArrayList<Double> coordinates = new ArrayList<Double>();
		coordinates.add(this.latitude);
		coordinates.add(this.longitude);
		return coordinates;
	}
	
	
	
	/**
	 * 
	 * @param newName
	 */
	public void setName(String newName) 
	{
		this.name = newName;
	}
	
	/**
	 * 
	 * @param newCapacity
	 */
	public void setCapacity(int newCapacity)
	{
		this.capacity = newCapacity;
	}
	
	/**
	 * 
	 * @param newLatitude
	 */
	public void setLatitude(double newLatitude)
	{
		this.latitude = newLatitude;
	}
	
	/**
	 * 
	 * @param newLongitude
	 */
	public void setLongitude(double newLongitude)
	{
		this.longitude = newLongitude;
	}
	
	
	
	
}











