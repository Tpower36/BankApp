/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.services.Services;
import javax.inject.Inject;

/**
 *
 * @author thierry.hubmann
 */
public class CustomerCreateBean {

    @Inject Services services;
    
    private int number;
    private String firstname;
    private String lastname;
    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public void createCustomer(){
        services.saveCustomer(number, firstname, lastname);
    }
    
}
