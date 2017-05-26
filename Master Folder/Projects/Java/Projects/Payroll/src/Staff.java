import java.util.Calendar;

/**
 * Staff Class that extends Employee and implements extra methods
 * @author Carlos Hurtado
 * @version 5/26/17
 */
public class Staff extends Employee implements EmployeeInfo
{
	/**GLOBAL VARIABLE*/
	private double hourly_rate;
	
	/**CONSTRUCTORS*/
	
	/**
	 * Default Constructor
	 */
	public Staff()
	{
		super();
		hourly_rate = 10.75;
	}
	
	/**
	 * Argumentative constructor that sets the staff member's information plus hourly rate
	 * @param lastName The staff member's last name
	 * @param firstName The staff member's first name
	 * @param idNumber The staff member's ID number that was assigned to them
	 * @param sex The staff member's identified sex
	 * @param birthDate The staff member's date of birth
	 * @param hRate The staff member's hourly rate
	 */
	public Staff(String lastName, String firstName, String idNumber, String sex, Calendar birthDate, double hRate)
	{
		super(lastName, firstName, idNumber, sex, birthDate);
		hourly_rate = hRate;
	}
	
	/**METHODS*/
	
	/**
	 * Method that returns the product of the staff member's hourly_rate and the amount of full time hours (160)
	 * @return The staff member's monthly earning
	 */
	@Override
	public double monthlyEarning() 
	{
		return hourly_rate * STAFF_MONTHLY_HOURS_WORKED;
	}
	
	/**
	 * Method that sets the staff member's hourly_rate with an updated double
	 * @param hRate The staff member's updated hourly_rate 
	 */
	public void setHourlyRate(double hRate)
	{
		hourly_rate = hRate;
	}
	
	/**
	 * Method that returns the staff member's current hourly_rate
	 * @return The staff member's current hourly_rate
	 */
	public double getHourlyRate()
	{
		return hourly_rate;
	}
	
	/**
	 * Method that returns a string representation of the staff members's information
	 * @return The string representation of the staff members's information
	 */
	@Override
	public String toString()
	{
		String info = super.toString();
		return info + "Full Time\nMonthly Salary: $"+monthlyEarning() +"\n";
	}
	
}
