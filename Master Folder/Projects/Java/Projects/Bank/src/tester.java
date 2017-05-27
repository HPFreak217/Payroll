import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class tester 
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<BankAccount> bList = new ArrayList<BankAccount>();
		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		bList.add(ba);
		bList.add(ba1);
		bList.add(ba2);
		File account = new File("BankAccount.txt");
		Scanner in = new Scanner(account);
		ba.read(in);
		ba1.read(in);
		ba2.read(in);
		double highest = 0;
		int acc = 0;
		for(BankAccount c: bList)
		{
			if(c.getBalance()>highest)
			{
				acc = c.getAccount();
				highest = c.getBalance();
			}
		}
		System.out.println("ACCOUNT: "+acc+"\nBALANCE: "+highest);
		
		
	}
}
