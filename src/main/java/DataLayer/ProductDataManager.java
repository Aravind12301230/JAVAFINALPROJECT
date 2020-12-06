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


import BusinessLayer.Product;
import java.util.ArrayList;

public class ProductDataManager {
	 private ArrayList<Product> products;
	    
	    public ProductDataManager() {
	        this.products = new ArrayList<Product>();
	    }
	    
	    public Product create(Product prodToCreate) {
	        this.products.add(prodToCreate);
	        
	        return prodToCreate;
	    }
	    
	    
	    public ArrayList<Product> getAll() {
	        return this.products;
	    }
	    
	    public ArrayList<Product> getByProductNumber(int productId) {
	        ArrayList<Product> output = new ArrayList<Product>();
	        
	        for (Product prod : this.products) {
	            if (prod.getProductId() == productId) {
	                output.add(prod);
	            }
	        }
	        
	        return output;
	    }
}
 

