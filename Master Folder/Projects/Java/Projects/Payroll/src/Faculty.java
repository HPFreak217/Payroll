import java.util.Calendar;

/**
 * Class that extends Employee class and contains faculty information
 */
public class Faculty extends Employee implements EmployeeInfo
{
	/**ENUMS*/
	/**
	 * Enum that contains information on what position the employee is known as
	 * "AS": assistant professor 
	 * "AO": associate professor 
	 * "FU": professor
	 */
	private enum Level
	{
		AS, AO, FU
	}
	
	/**GLOBAL VARIABLES*/
	private Level level;
	private Education edu;
	
	/**CONSTRUCTORS*/
	
	/**
	 * Default constructor
	 */
	public Faculty()
	{
		level = Level.AS;
		edu = new Education();
	}
	
	/**
	 * Argumentative constructor that allows the user to manually input the employee's information
	 * @param lastName The staff member's last name
	 * @param firstName The staff member's first name
	 * @param idNumber The staff member's ID number that was assigned to them
	 * @param sex The staff member's identified sex
	 * @param birthDate The staff member's date of birth
	 * @param str The employee's position level
	 * @param edu The employee's education information
	 */
	public Faculty(String lastName, String firstName, String idNumber, String sex, Calendar birthDate, String str, Education edu)
	{
		super(lastName, firstName, idNumber, sex, birthDate);
		if(str.equalsIgnoreCase("fu")) //professor 
		{
			level = Level.FU;
		}
		else if(str.equalsIgnoreCase("ao")) //associate professor
		{
			level = Level.AO;
		}
		else //assistant professor (DEFAULT)
		{
			level = Level.AS;
		}
		this.edu = edu;
	}
	
	/**METHODS*/
	
	/**
	 * Method that returns employee's monthly earning based on position
	 * @return Employee's monthly earning
	 */
	@Override
	public double monthlyEarning() {
		double monthly = 0.0;
		switch(level)
		{
		case AS:
			monthly = FACULTY_MONTHLY_SALARY;
			break;
		case AO:
			monthly = 1.5*FACULTY_MONTHLY_SALARY;
			break;
		default:
			monthly = 2.0*FACULTY_MONTHLY_SALARY;
			break;
		}
		return monthly;
	}
	
	@Override
	public String toString()
	{
		String info = super.toString();
		String position = "";
		switch(level)
		{
		case AS:
			position = "Assistant Professor";
			break;
		case AO:
			position = "Associate Professor";
			break;
		default:
			position = "Professor";
			break;
		}
		return info + position + "\nMonthly Salary: $"+monthlyEarning() + "\n";
	}
	
	/**ACCESSOR METHODS*/
	
	/**
	 * Method that returns the employee's position level
	 * @return The employee's position level
	 */
	public String getLevel()
	{
		return level + "";
	}
	
	/**
	 * Method that returns employee's education information
	 * @return The employee's education information 
	 */
	public Education getEdu()
	{
		return edu;
	}
	
	/**MUTATOR METHODS*/
	
	/**
	 * Method that resets the employee's position level
	 * @param str The employee's new position level
	 */
	public void setLevel(String str)
	{
		if(str.equalsIgnoreCase("fu")) //professor 
		{
			level = Level.FU;
		}
		else if(str.equalsIgnoreCase("ao")) //associate professor
		{
			level = Level.AO;
		}
		else //assistant professor (DEFAULT)
		{
			level = Level.AS;
		}
	}
	
	/**
	 * Method that resets employee's education information
	 * @param The employee's new education information 
	 */
	public void setEdu(Education edu)
	{
		this.edu = edu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
