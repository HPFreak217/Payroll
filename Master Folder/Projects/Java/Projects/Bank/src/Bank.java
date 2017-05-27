import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * A bank contains account numbers and balances of each customer.
 */
public class Bank 
{
	private ArrayList<BankAccount> accountList;

	/**
	 * Construct a Bank object.
	 */
	public Bank()
	{
		accountList = new ArrayList<BankAccount>();
	}


	/**
	 * Reads a file with account numbers and balances and adds the accounts to
	 * the bank.
	 * @param filename the name of the file
	 */
	public void readFile(String filename) throws IOException 
	{ // Create File object, a scanner object to read data from the file.
	  //call the method read
		File reader = new File(filename);
		Scanner in = new Scanner(reader);
		try 
		{
			while(in.hasNextLine())
			{
				String line = "";
				int pos = 0;
    			line = in.nextLine();
    			for(int i = 0; i < line.length(); i++)
    			{
    				if(line.substring(i, i+1).equals(" "))
    				{
    					pos = i;
    					i = line.length();
    				}
    			}
    			int accountNumber = Integer.parseInt(line.substring(0,pos));
    			double balance = Double.parseDouble(line.substring(pos+1));
    			BankAccount temp = new BankAccount(balance, accountNumber);
    			accountList.add(temp);
			}

		} finally {
			in.close();
		}
	}

	/**
	 * Add an account to the bank.
	 * 
	 * @param b the BankAccount reference
	 */
	public void addAccount(BankAccount b)
	{
		accountList.add(b);
	}
	
	/**
	 * Gets the account with the highest balance.
	 * @return the account with the highest balance
	 */
	public BankAccount getHighestBalance() 
	{
		double highest = 0;
		int acc = 0;
		for(BankAccount c: accountList)
		{
			if(c.getBalance()>highest)
			{
				acc = c.getAccount();
				highest = c.getBalance();
			}
		}
		return new BankAccount(highest, acc);
		
	}
}