package oopsAssignment;

public class ExampleEncapsulation {
	    private int accountNumber = 12345;
	    private double balance = 1000;

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    void deposit(double amount) {
	        if (amount > 0) {
	            balance = balance + amount;
	        }
	    }

	    void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	        } else {
	            System.out.println("Invalid withdrawal");
	        }
	    }

	    public static void main(String[] args) {
	    	ExampleEncapsulation b = new ExampleEncapsulation();

	        b.deposit(500);
	        b.withdraw(200);

	        System.out.println(b.getAccountNumber());
	        System.out.println(b.getBalance());
	    }
	}

