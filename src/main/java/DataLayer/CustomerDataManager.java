/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author DELL
 */


import BusinessLayer.Customer;
import java.util.ArrayList;

public class CustomerDataManager {
	 
    private ArrayList<Customer> customers;
    
    public CustomerDataManager() {
        this.customers = new ArrayList<Customer>();
    }
    
    public Customer create(Customer custToCreate) {
        
        this.customers.add(custToCreate);
        
        return custToCreate;
    }
    
    
    public ArrayList<Customer> getAll() {
        return this.customers;
    }
    
    public ArrayList<Customer> getByCustomerNumber(int customerId) {
        ArrayList<Customer> output = new ArrayList<Customer>();
        
        for (Customer cust : this.customers) {
            if (cust.getCustomerId() == customerId) {
                output.add(cust);
            }
        }
        
        return output;
    }
}
  

