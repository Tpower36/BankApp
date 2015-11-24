package ch.hearc.ig.odi.customeraccount.business;
/**
 * Cette classe nous permet de gérer le compte.
 * @author thierry.hubmann
 */
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
	 * Cette méthode va créditer le compte donné en paramètre
	 * @param amount Le montant
	 */
	public void credit(double amount) {
		this.balance = balance + amount;
	}

	/**
	 * Cette méthode va débiter le compte donné en paramètre
	 * @param amount Le montant
	 */
	public void debit(double amount) {
		this.balance = balance - amount;
	}

	/**
	 * Cette méthode va permettre de transférer des fonds entre deux comptes
	 * @param amount Le montant
	 * @param source Le compte source
	 * @param target Le compte de destination
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