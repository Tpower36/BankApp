/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author thierry.hubmann
 */
public class Bank {
    int number;
    String name;
    Map<Integer, Customer> customers;
    Map<String, Account> accounts;
    

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        
        customers = new HashMap();
        accounts = new HashMap();
    }
    
    public Account getAccountByNumber(String number){
        return accounts.get(number);
    }
    
    public Customer getCustomerByNumber(int number){
        return customers.get(number);
    }
    
    public void addCustomer(int number, String firstName, String lastName){
        customers.put(number, new Customer(number, firstName, lastName));
    }
    
    public void addAccount(String number, String name, double rate, Customer customer){
        accounts.put(number, new Account(number, name, rate, customer));
    }
}
