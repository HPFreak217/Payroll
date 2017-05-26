/**
 * Class that stores education attributes of an employee
 * @author Carlos Hurtado
 * @version 5/26/17
 */
public class Education 
{
	/**GLOBAL VARIABLES*/
	private String degree, major;
	private int research;
	
	/**CONSTRUCTORS*/
	
	/**
	 * Default constructor
	 */
	public Education()
	{
		degree = "B.S.";
		major = "Computer Science";
		research = 0;
	}
	
	/**
	 * Argumentative constructor that allows user to initially set up education info
	 * @param degree The employee's degree information
	 * @param major The employee's information on their major
	 * @param research The amount of research that the employee has participated in
	 */
	public Education(String degree, String major, int research)
	{
		this.degree = degree;
		this.major = major;
		this.research = research;
	}
	
	/**ACCESSOR METHODS*/
	
	/**
	 * Method that retrieves employee's degree information
	 * @return The employee's degree information
	 */
	public String getDegree()
	{
		return degree;
	}
	
	/**
	 * Method that retrieves employee's information on their major
	 * @return The employee's information on their major
	 */
	public String getMajor()
	{
		return major;
	}
	
	/**
	 * Method that retrieves employee's information on how many researches they have participated in
	 * @return The employee's information on how many researches they have participated in
	 */
	public int getResearchAmount()
	{
		return research;
	}
	
/**Mutator METHODS*/
	
	/**
	 * Method that resets employee's degree information
	 * @param The employee's new degree information
	 */
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
	
	/**
	 * Method that resets employee's information on their major
	 * @param The employee's information on their new major
	 */
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	/**
	 * Method that resets employee's information on how many researches they have participated in
	 * @param The employee's information on how many researches they have participated in
	 */
	public void setResearchAmount(int amount)
	{
		research = amount;
	}
}