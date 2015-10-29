package ch.hearc.ig.odi.customeraccount.business;
public class Account {

	private Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public Account(String number, String name, double rate, Customer customer) {
		this.number = number;
                this.name = name;
                this.rate = rate;
                this.customer = customer;
	}

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
		this.balance = balance + amount;
	}

	/**
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
		this.balance = balance - amount;
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public static void transfert(double amount, Account source, Account target) {
		source.debit(amount);
                target.credit(amount);
	}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}