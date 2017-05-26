import java.util.Calendar;

/**
 * Employee class that takes into account employee's hours if they don't work full time
 * @author Carlos Hurtado
 * @version 5/26/17
 */
public class Partime extends Staff implements EmployeeInfo
{
	/**GLOBAL VARIABLES*/
	private int hours;
	
	/**CONSTRUCTORS*/
	
	/**
	 * Default constructors
	 */
	public Partime()
	{
		super();
		hours = 0;
	}
	
	/**
	 * Argumentative constructor that sets the staff member's information plus hourly rate
	 * @param lastName The staff member's last name
	 * @param firstName The staff member's first name
	 * @param idNumber The staff member's ID number that was assigned to them
	 * @param sex The staff member's identified sex
	 * @param birthDate The staff member's date of birth
	 * @param hRate The staff member's hourly rate
	 * @param hours The amount of hours that the staff member has worked
	 */
	public Partime(String lastName, String firstName, String idNumber, String sex, Calendar birthDate, double hRate, int hours)
	{
		super(lastName, firstName, idNumber, sex, birthDate, hRate);
		this.hours = hours;
	}
	
	/**METHODS*/
	
	/**
	 * Method that returns the total monthly earnings for the employee
	 * @return The employee's total monthly earnings
	 */
	public double monthlyEarning()
	{
		return hours * super.getHourlyRate();
	}
	
	/**
	 * Method that retrieves the amount of information that the employee has worked
	 * @return The amount of hours that the employee has worked
	 */
	public int getHours()
	{
		return hours;
	}
	
	/**
	 * Method that resets the amount of information that the employee has worked
	 * @return The new amount of hours that the employee has worked
	 */
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	/**
	 * Method that returns a string representation of the employee's information
	 * @return The string representation of the employee's information
	 */
	@Override
	public String toString()
	{
		String bDay = super.getBirthDate().get(Calendar.MONTH) + "/" + super.getBirthDate().get(Calendar.DATE) +"/" + super.getBirthDate().get(Calendar.YEAR);
		String info = "Employee ID Number: " + super.getIDNumber() +"\nEmployee Name: "+ super.getLastName() +", " + super.getFirstName() +"\nBirth Date: " + bDay +"\n";
		return info + "Hours Worked per Month: "+ hours +"\nMonthly Salary: $" + monthlyEarning() + "\n";
	}
}
