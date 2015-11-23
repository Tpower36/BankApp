/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.business.Bank;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author thierry.hubmann
 */
public class CustomerBean implements Serializable{

    private List customers;
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
        customers= new Services().getCustomersList();
    }

    public List getCustomers() {
        return customers;
    }
    
    
    
    
}
