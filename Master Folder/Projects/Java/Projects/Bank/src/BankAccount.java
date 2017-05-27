import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
	private double balance;
    private int accountNumber;

	/**
	 * Default constructor
	 */
    public BankAccount()
    {
    	balance = 0.0;
    	accountNumber = 000;
    }
	/**
	 * Argumentative constructor that constructs a bank account with a given account number and a initial
	 * balance.
	 * @param balance The amount of money being added to the account
	 * @param accNumber The "ID" number being assigned to the account
	 */
    public BankAccount(double balance, int accNumber)
    {
    	this.balance = balance;
    	accountNumber = accNumber;
    }

	/**
	 * Reads an account number and balance.
	 * @param in the scanner
	 * @return true if the data was read false if the end of the stream was reached
	 * */
    public void read(Scanner input) throws IOException
    {
    	String line = "";
    	try
    	{
    		if(input.hasNextLine())
    		{
    			int pos = 0;
    			line = input.nextLine();
    			for(int i = 0; i < line.length(); i++)
    			{
    				if(line.substring(i, i+1).equals(" "))
    				{
    					pos = i;
    					i = line.length();
    				}
    			}
    			accountNumber = Integer.parseInt(line.substring(0,pos));
    			balance = Double.parseDouble(line.substring(pos+1));
    		}
    	} 
    	catch(NoSuchElementException ime)
    	{
    		throw new NoSuchElementException("-Invalid Format-");
    	}
    }

	/**
	 * Deposits money into the bank account.
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}

	/**
	 * Withdraws money from the bank account.
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount) 
	{
		balance-=amount;
	}
	
	/**
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	public double getBalance() 
	{
		return balance;
	}

	/**
	 * Gets the account number of the bank account.
	 * @return the account number
	 */
	public int getAccount() 
	{
		return accountNumber;
	}

}