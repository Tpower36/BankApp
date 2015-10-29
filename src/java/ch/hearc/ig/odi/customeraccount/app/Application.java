/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.app;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Bank;
import ch.hearc.ig.odi.customeraccount.business.Customer;

/**
 *
 * @author thierry.hubmann
 */
public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank(1, "UBS");
        
        bank.addCustomer(1, "Thierry", "Hubmann");
        bank.addCustomer(2, "John", "Bovi");
        
        bank.addAccount("001-2001", "Compte épargne", 0.2, bank.getCustomerByNumber(1));
        
        System.out.println(bank.getAccountByNumber("001-2001").getName());
        
    }
    
}
