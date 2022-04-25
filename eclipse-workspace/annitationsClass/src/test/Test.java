package test;

import java.lang.annotation.Annotation;

import annitations.Bank;
import entity.Account;

public class Test {

	public static void main(String[] args)throws Exception {
		Account Acc = new Account("12345-sbi","Mahendra","Savings",100000);
		Acc.getDetails();
		//Class<?> cls=Class.forName("entity.Account");
		Class<Account> cls = Account.class;
		
		Annotation ann = cls.getAnnotation(Bank.class);
		
		Bank bank=(Bank)ann;
		
		System.out.println();
		System.out.println("Bank Details"+"\n--------------------");
		System.out.println("Bank Id     :  "+bank.bid());
		System.out.println("Bank Name   :  "+bank.bname());
		System.out.println("Branch      :  "+bank.branch());
		System.out.println("Website     :  "+bank.website());
	}

}
