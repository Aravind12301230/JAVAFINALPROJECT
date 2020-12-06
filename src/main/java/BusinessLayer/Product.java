/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author DELL
 */


public class Product {
	private int productId;
    private String description;
    private int quantityOnHand;
    private double price;

    public Product(int id, String desc, int qtyOnHand, int price) {
        this.productId = id;
        this.description = desc;
        this.quantityOnHand = qtyOnHand;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", description=" + description + ", quantityOnHand=" + quantityOnHand + ", price=" + price + '}';
    }

}
    
