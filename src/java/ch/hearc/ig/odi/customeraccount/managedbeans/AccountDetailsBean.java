/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedbeans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import javax.ejb.Stateful;
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
    
    private Account account;

    /**
     * Creates a new instance of AccountDetailsBean
     */
    public AccountDetailsBean() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    
    /**
     * Récupère le compte à afficher en détails
     * @param account
     * @return 
     */
    public int recupAccount(Account account) {
        if(account != null){
            this.account = account;
            return 0;
        }else{
            this.account = null;
            return 1;
        }
    }
}
