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

    

import BusinessLayer.OrderItem;
import java.util.ArrayList;

public class OrderItemDataManager {
	 private ArrayList<OrderItem> orderItems;
	    
	    public OrderItemDataManager() {
	        this.orderItems = new ArrayList<OrderItem>();
	    }
	    
	    public OrderItem create(OrderItem itemToCreate) {
	        this.orderItems.add(itemToCreate);
	        
	        return itemToCreate;
	    }
	    
	    
	    public ArrayList<OrderItem> getAll() {
	        return this.orderItems;
	    }
	    
	    public ArrayList<OrderItem> getByOrderId(int orderNumber) {
	        ArrayList<OrderItem> output = new ArrayList<OrderItem>();
	        
	        for (OrderItem odritem : this.orderItems) {
	            if (odritem.getOrderNumber() == orderNumber) {
	                output.add(odritem);
	            }
	        }
	        
	        return output;
	    }
}

