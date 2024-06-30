package com.exe;

public class BankingApp {
	int accountNo;
	int balance;

	public BankingApp(int accountNo,int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;

	}
	//for depositing amount to the account
	void deposit(int amt) {
		balance+=amt;
		System.out.println("New Balance:"+balance);
	}
	//for withdrawing amount
	void withDraw(int amt) throws InsufficientBalanceException{
		if(balance>amt) {
			balance-=amt;
			System.out.println("Amount withdrawn successfully"+amt+"\n New Balance:"+balance);
	}
		else
			throw new InsufficientBalanceException ("Insufficient Balance");
	}
   public static void main(String[]  args){
	   
	  BankingApp bankingApp=new BankingApp(3456324,2000);
	  bankingApp.deposit(3000);
	try {
	  bankingApp.withDraw(20000);
   }catch(InsufficientBalanceException e) {
	//print the transaction amount
	System.out.println(e);
	}
   }
  }
