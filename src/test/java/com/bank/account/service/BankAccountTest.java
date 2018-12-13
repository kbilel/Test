package com.bank.account.service;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import Exceptions.NegativeAmountException;
import bank.Manager.BankAccount;


public class BankAccountTest {
	
	@Test
	public void bank_account_deposit__with_positive_amount_succed() {
		BankAccount account1 = new BankAccount();
		account1.setName("bilel");
		account1.setBalance(2000.00);
		account1.setId(12345);
		account1.deposit(1000);
		assertEquals(3000, account1.getBalance(),0);
		//Assert.assertTrue(200 == responseEvent.getStatusCode());
	}
	
	 @Test(expected = NegativeAmountException.class)
	public void bank_account_deposit__with_negative_ammout_should_throw_NegativeAmountException() {
		BankAccount account1 = new BankAccount();
		account1.setName("bilel");
		account1.setBalance(2000.00);
		account1.setId(12345);
		account1.deposit(-200);
	
	}
	 
	 @Test(expected = NegativeAmountException.class)
		public void bank_account_withdraw__when_amount_negative_should_throw_NegativeAmountException() {
			BankAccount account1 = new BankAccount();
			account1.setName("bilel");
			account1.setBalance(2000.00);
			account1.setId(12345);
			account1.withdraw(-200);
		
		}
}
