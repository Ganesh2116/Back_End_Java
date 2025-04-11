package synchronizationBlock.pkg;

import java.util.Scanner;

//Implement a banking system where deposit and withdrawal operations are synchronized 
//using a synchronized block.


class Banking 
{
	int balance ;
	int deposit ;
	int withdrawal;
	
	Scanner sc = new Scanner(System.in);
	
	public void depositOrWithdrawal() 
	{
		
		
		System.out.println("Enter the amount balance");
		this.balance = sc.nextInt();
		
		System.out.println("Enter 1 for deposit and 2 for withdrawal");
		int num = sc.nextInt();
		
		if (num == 1)
		{
			deposit();
		}
		else if (num == 2)
		{
			withdrawal();
		}
		else
		{
			System.out.println("Invalid number...");
		}
	}
	
	public void deposit()
	{
		synchronized (this) {
			
			System.out.println("Enter the amount of deposit");
			this.deposit = sc.nextInt();
			
			if (this.deposit > 0)
			{
				System.out.println("Succesfully amount deposit..");
				int depositbalance = this.deposit+this.balance;
				System.out.println("Amount is now :"+depositbalance);
			}
			else
			{
				System.out.println("deposit min amount");
			}
		}
	}
	
	public void withdrawal()
	{
		synchronized (this) {
			
			System.out.println("Enter the amount of withdrawal");
			this.withdrawal = sc.nextInt();
			
			if (balance >= this.withdrawal)
			{
				System.out.println("Succesfully amount withdrawal ");
				int withdrawalbal = balance - withdrawal;
				System.out.println("Amount is now :"+withdrawalbal);
			}
			else
			{
				System.out.println("Enter the amount valid and less than your balance");
			}
			
		}
	}
}

public class Question07 extends Thread
{
	static Banking obj = new Banking();
	
	public void run()
	{
		obj.depositOrWithdrawal();
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		obj.start();
	}

}
