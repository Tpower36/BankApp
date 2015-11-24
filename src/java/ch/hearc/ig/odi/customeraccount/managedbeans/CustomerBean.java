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
import javax.inject.Inject;

/**
 *
 * @author thierry.hubmann
 */

public class CustomerBean implements Serializable{

    /**
     * Creates a new instance of CustomerBean
     */
    
    @Inject Services services;
    
    public CustomerBean() {
    }

    /**
     * Va utiliser l'objet service de la session pour récupérer les clients de 
     * la banque
     * @return la liste des clients
     */
    public List getCustomers() {
        return services.getCustomersList();
    }
    
    
    
    
}
