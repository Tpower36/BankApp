/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 * Il faut annoter cette classe avec SessionScoped car l'objet doit rester en
 * mémoire même après une redirection.
 * @author thierry.hubmann
 */
@SessionScoped
@Named(value = "accountDetailsBean")
public class AccountDetailsBean implements Serializable{
    @Inject
    Services services;
    
        private String number;
	private String name;
	private double balance;
	private double rate;
        private int customerNumber;

    /**
     * Creates a new instance of AccountDetailsBean
     */
    public AccountDetailsBean() {
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
    
    public int test(){
        return 0;
    }
    public int recupAccount(String number) {
        this.number = number;
        Account account = services.getAccountByNumber(number);
        this.name = account.getName();
        this.balance = account.getBalance();
        this.rate = account.getRate();
        
        return 0;
    }
}
