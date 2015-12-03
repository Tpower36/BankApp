/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
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

    private Customer customer;

    /**
     * Creates a new instance of CustomerDetailsBean
     */
    public CustomerDetailsBean() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    

    /**
     * Cette méthode récupère le client
     *
     * @param cust le client
     * @return 0 si le client à été récupéré
     */
    public int recupCustomer(Customer cust) {
        if (cust != null) {
            customer = cust;
            return 0;
        } else {
            customer = null;
            return 1;
        }
    }
}
