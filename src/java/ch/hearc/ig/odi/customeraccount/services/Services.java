package ch.hearc.ig.odi.customeraccount.services;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Bank;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 * Classe de services qui stocke les données de l'application dans la session de l'utilisateur.
 * Cette classe est gérée par CDI et peut donc être injectée dans les autres classes Java.
 * @author julien.plumez
 */
@SessionScoped
@Stateful
public class Services implements Serializable{
    
    private Bank bank;
    
    public Services(){
        bank = new Bank(1, "Raiffeisen Neuchâtel");
        
        Customer cust = bank.addCustomer(1, "Jean", "Dupont");
        
        bank.addAccount("1", "Salaire", 0.001, cust);
        bank.addAccount("2", "Impots", 0.002, cust);
        
        cust = bank.addCustomer(2, "Marie", "Dupont");
        bank.addAccount("3", "Epargne", 0.002, cust);
        bank.addAccount("4", "Salaire", 0.001, cust);
    }
    
    /**
     * Dit à la banque de créer un nouveau client.
     * @param number Le numéro unique du client
     * @param fn Le prénom du client
     * @param ln Le nom du client
     */
    public void saveCustomer(Integer number, String fn, String ln){
        bank.addCustomer(number, fn, ln);
    }
    
    /**
     * Dit à la banque de créer un nouveau compte
     * @param number le numéro du compte
     * @param name le nom du compte
     * @param rate le taux
     * @param customer le client auquel appartient le compte
     */
    public void saveAccount(String number, String name, double rate, Customer customer){
        bank.addAccount(number, name, rate, customer);
    }

    /**
     * Retourne le client de la banque qui correspond au numéro passé en paramètre.
     * @param number Le numéro du client à rechercher
     * @return Le client, ou null s'il n'est pas trouvé
     */
    public Customer getCustomer(Integer number){
        return bank.getCustomerByNumber(number);
    }
    
    /**
     * Retourne une Map contenant tous les clients de la banque
     * @return Une Map contenant tous les clients de la banque
     */
    public Map<Integer, Customer> getCustomers(){
        return bank.getCustomers();
    }
    
    /**
     * Retourne une List contenant tous les clients de la banque.
     * Utile pour l'affichage des clients dans les facelets
     * @return Une List contenant tous les clients de la banque.
     */
    public List<Customer> getCustomersList(){
        return new ArrayList(getCustomers().values());
    }
    
    /**
     * Retourne un Account lorsqu'on spécifie un numéro valable
     * @param number le numéro du compte
     * @return l'account recherché
     */
    public Account getAccountByNumber(String number){
        return bank.getAccountByNumber(number);
    }
}
