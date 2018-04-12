package edu.handong.csee.java.lab09.prob1;
/**
 * a class that contains an array and methods that get data and put data into an array
 */
public class SalesAssociate {
	
	private String name; //declare a string "name"
	private double sales;//declare a double "sales"
	
	/**
	 * a method stores name
	 */
	public void setName(String name)
	{
		this.name = name;//store "name" in a global variable "name"
	}
	
	/**
	 * a method stores sales 
	 */
	public void setSales(double sales)
	{
		this.sales = sales; //store "sales" in a global variable "sales"
	}
	
	/**
	 * a method gives name
	 */
	public String getName()
	{
		return name; 	//give the value "name"
	}
	
	/**
	 * a method gives sales
	 */
	public double getSales()
	{
		return sales;//give the value "sales"
	}

}
