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

import BusinessLayer.Order;
import java.util.ArrayList;

public class OrderDataManager {
	 private ArrayList<Order> orders;
	    
	    public OrderDataManager() {
	        this.orders = new ArrayList<Order>();
	    }
	    
	    public Order create(Order odrToCreate) {
	        this.orders.add(odrToCreate);
	        
	        return odrToCreate;
	    }
	    
	    
	    public ArrayList<Order> getAll() {
	        return this.orders;
	    }
	    
	    public ArrayList<Order> getByCustomerNumber(int customerId) {
	        ArrayList<Order> output = new ArrayList<Order>();
	        
	        for (Order odrs : this.orders) {
	            if (odrs.getCustomerId() == customerId) {
	                output.add(odrs);
	            }
	        }
	        
	        return output;
	    }
}   

