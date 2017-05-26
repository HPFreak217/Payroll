import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Abstract class that defines main characteristics of an employee
 * @author Carlos Hurtado
 * @version 5/26/17
 */
public abstract class Employee 
{
	/**GLOBAL VARIABLES*/
	private String lastName, firstName, idNumber, sex;
	private Calendar birthDate;
	
	/**CONSTRUCTORS*/
	
	/**
	 * Default constructor that assigns the global variables certain values
	 */
	public Employee()
	{
		lastName = "Hurtado";
		firstName = "Carlos";
		idNumber = "000";
		sex = "M";
		birthDate = new GregorianCalendar(); // Initialize birthDate to a new GregorianCalendar() object
		birthDate.set(1997, 4, 4);
	}
	
	/**
	 * Argument constructor that allows user to input their own values for global variables
	 * @param lastName The employee's last name
	 * @param firstName The employee's first name
	 * @param idNumber The employee's ID number that was assigned to them
	 * @param sex The employee's identified sex
	 * @param birthDate The employee's date of birth
	 */
	public Employee(String lastName, String firstName, String idNumber, String sex, Calendar birthDate)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.idNumber = idNumber;
		this.sex = sex;
		this.birthDate = birthDate;
	}
	
	/**METHODS*/
	
	/**
	 * Method that returns a string representation of the employee's information
	 * @return The string representation of the employee's information
	 */
	@Override
	public String toString()
	{
		String bDay = birthDate.get(Calendar.MONTH) + "/" + birthDate.get(Calendar.DATE) +"/" + birthDate.get(Calendar.YEAR);
		return "Employee ID Number: " + idNumber +"\nEmployee Name: "+lastName +", " + firstName +"\nBirth Date: " + bDay +"\n";
	}
	
	/**ACCESSOR METHODS*/
	
	/**
	 * Method that returns the Employee's last name
	 * @return The employee's last name
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Method that returns the Employee's first name
	 * @return The employee's first name
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Method that returns the Employee's ID number
	 * @return The employee's ID number
	 */
	public String getIDNumber()
	{
		return idNumber;
	}
	
	/**
	 * Method that returns the Employee's sex
	 * @return The employee's sex assigned at birth
	 */
	public String getSex()
	{
		return sex;
	}
	
	/**
	 * Method that returns the Employee's Birth date
	 * @return The employee's date of birth
	 */
	public Calendar getBirthDate()
	{
		return birthDate;
	}
	
	/**MUTATOR METHODS*/
	
	/**
	 * Method that sets the Employee's last name to a new last name
	 * @param str The employee's new last name
	 */
	public void setLastName(String str)
	{
		lastName = str;
	}
	
	/**
	 * Method that sets the Employee's first name to a new last name
	 * @param str The employee's new first name
	 */
	public void setFirstName(String str)
	{
		firstName = str;
	}
	
	/**
	 * Method that assigns the Employee a new ID number
	 * @param str The employee's new ID number
	 */
	public void setIDNumber(String str)
	{
		idNumber = str;
	}
	
	/**
	 * Method that sets the Employee's sex to corrected or update one
	 * @param str The employee's corrected or updated sex
	 */
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	/**
	 * Method that updates the Employee's birth date
	 * @param str The employee's updated birth date
	 */
	public void setNewBDay(Calendar bday)
	{
		birthDate = bday;
	}
	
	/**ABSTRACT METHODS*/
	
	/**
	 * Method that returns the Employee's monthly earning
	 * @return The Employee's monthly earning
	 */
	public abstract double monthlyEarning();
}
