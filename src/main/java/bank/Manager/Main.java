package bank.Manager;


import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		java.util.List<BankAccount> accounts = new ArrayList<BankAccount>();
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		account1.setName("bilel");
		account1.setBalance(2000.00);
		account1.setId(12345);
		accounts.add(account1);
		
		BankAccount account2 = new BankAccount();
		account2.setName("bilel");
		account2.setBalance(2000.00);
		account2.setId(12345);
		accounts.add(account2);
		
		
		System.out.println(account1);
		account1.deposit(-1000);
		System.out.println("after deposit" + account1);
		account1.withdraw(250);
		System.out.println("after witdhraw" + account1);
	}

}
