package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

    private List<Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    public Customer(Integer number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;

        this.accounts = new ArrayList<>();
    }

    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        Account account = null;
        boolean found = false;
        int i = 0;
        while (!found && i <= accounts.size()) {
            if (accounts.get(i).getNumber().equals(number)) {
                found = true;
                account = accounts.get(i);
            }
        }
        if (!found) {
            throw new IllegalArgumentException("This account doesn't exist");
        }
        return account;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    public void addAccount(String number, String name, double rate) {
        Account newAccount = new Account(number, name, rate, this);
        accounts.add(newAccount);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    

}