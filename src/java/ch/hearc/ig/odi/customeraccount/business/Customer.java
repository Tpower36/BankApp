package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

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

}