/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import ch.hearc.ig.odi.custommeraccount.tools.JsfTools;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author thierry.hubmann
 */
@Named(value = "accountCreateBean")
public class AccountCreateBean {

    @Inject
    Services services;

    private String number;
    private String name;
    private double balance;
    private double rate;

    /**
     * Creates a new instance of AccountCreateBean
     */
    public AccountCreateBean() {
    }

     public int createAccount(){
        CustomerDetailsBean customerBean = JsfTools.findBean("customerDetailsBean", CustomerDetailsBean.class);
        Customer customer = services.getCustomer(customerBean.getNumber());
        services.saveAccount(number, name, rate, customer);
        return 0;
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
