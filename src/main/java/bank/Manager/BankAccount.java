package bank.Manager;

import Exceptions.NegativeAmountException;

public class BankAccount {
    
    private String name;
    private double balance; 
    private int id;
 
   

    public BankAccount() {
    	
    }
    public BankAccount(String initialName, double initialBalance, int rib) {
        name = initialName;
        balance = initialBalance;
        id = rib;
        // transactions = 0;
    }
    
    public void setTransactionFee(double fee) {
        if (fee >= 0.00) {
        }
    }
    

    public String toString() {
        return "name:"+ name  +" balance:" + " €"+balance;
    }
    

    public void deposit(double amount)  {
        if (amount >= 0.00) {
            balance = balance + amount;
        }
        else {
        	throw new NegativeAmountException ("Deposit ammout can't be   negative ");
        }
    }
    
  
    public void withdraw(double amount) {
        if (amount >= 0.00 && amount <= balance) {
            balance = balance - amount;
           
        }
        else if (amount <0) {
        	throw new NegativeAmountException ("No enough balance to withdraw  ");
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    
}