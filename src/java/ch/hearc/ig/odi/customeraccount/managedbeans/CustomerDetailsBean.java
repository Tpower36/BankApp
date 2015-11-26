/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Il faut annoter cette classe avec SessionScoped car l'objet doit rester en
 * mémoire même après une redirection.
 *
 * @author thierry.hubmann
 */
@SessionScoped
@Named(value = "customerDetailsBean")
public class CustomerDetailsBean implements Serializable {

    @Inject
    Services services;

    private int number;
    private String firstname;
    private String lastname;
    private List accounts;

    /**
     * Creates a new instance of CustomerDetailsBean
     */
    public CustomerDetailsBean() {
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

    public List getAccounts() {
        return accounts;
    }

    /**
     * Cette méthode récupère le client grâce à son numéro
     *
     * @param number le numéro du client
     * @return 0 si le client à été récupéré
     */
    public int recupCustomer(int number) {
        this.number = number;
        Customer customer = services.getCustomer(number);
        this.firstname = customer.getFirstName();
        this.lastname = customer.getLastName();
        this.accounts = customer.getAccounts();
        if (number > 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int test() {
        return 0;
    }
}
