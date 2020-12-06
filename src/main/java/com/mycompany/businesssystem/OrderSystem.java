/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.businesssystem;

/**
 *
 * @author DELL
 */

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataLayer.CustomerDataManager;
import DataLayer.OrderDataManager;
import DataLayer.OrderItemDataManager;
import DataLayer.ProductDataManager;

import java.sql.Date;
import java.util.ArrayList;

public class OrderSystem {

    public static void main(String[] args){

    	CustomerDataManager customerDm = new CustomerDataManager();
    	OrderDataManager orderDm = new OrderDataManager();
    	OrderItemDataManager orderItemDm = new OrderItemDataManager();
    	ProductDataManager productDm = new ProductDataManager();

    	Customer customer1 = new Customer(1, "Aravind", "Salpala", "6207190096");
    	Customer customer2 = new Customer(2, "Indu", "Pulichintha", "7036986932");
    	Customer customer3 = new Customer(3, "Akhila", "Salpala", "9959259678");
        
    	Product product1 = new Product(1001, "Chocolate", 10, 100);
    	Product product2 = new Product(2001, "ice cream", 8, 1000);
    	Product product3 = new Product(3001, "cake", 5, 500);
       
    	Order order1 = new Order(101, 1,"04-12-2020");
    	Order order2 = new Order(201, 2,"03-12-2020");
    	Order order3 = new Order(301, 3,"02-12-2020");
    	
    	OrderItem orderitem1 = new OrderItem(101, 1, 1001, "Chocolate", 2,100);
    	OrderItem orderitem2 = new OrderItem(101, 2, 2001, "ice cream", 2,1000);

       	OrderItem orderitem3 = new OrderItem(201, 1, 1001, "Chocolate", 2,100);
    	OrderItem orderitem4 = new OrderItem(201, 2, 3001, "cake", 5,500);
    	
    	OrderItem orderitem5 = new OrderItem(301, 1, 2001, "ice cream", 1,100);
    	OrderItem orderitem6 = new OrderItem(301, 2, 3001, "cake", 3,500);


    	customerDm.create(customer1);
    	customerDm.create(customer2);
    	customerDm.create(customer3);

    	productDm.create(product1);
    	productDm.create(product1);
    	productDm.create(product1);

    	orderDm.create(order1);
    	orderDm.create(order2);
    	orderDm.create(order3);

    	orderItemDm.create(orderitem1);
    	orderItemDm.create(orderitem2);
    	orderItemDm.create(orderitem3);
    	orderItemDm.create(orderitem4);
    	orderItemDm.create(orderitem5);
    	orderItemDm.create(orderitem6);
    	
    	System.out.println("Customers list");
        ArrayList<Customer> allCustomers = customerDm.getAll();
        System.out.println(allCustomers);
        
        System.out.println("Aravinds order");
        ArrayList<Order> aravindsOrders = orderDm.getByCustomerNumber(1);
        System.out.println(aravindsOrders);
        
        System.out.println("Indus order");
        ArrayList<Order> indusOrders = orderDm.getByCustomerNumber(2);
        System.out.println(indusOrders);

        System.out.println("Akhilas order");
        ArrayList<Order> akhilasOrders = orderDm.getByCustomerNumber(3);
        System.out.println(akhilasOrders);

        System.out.println("Aravinds orderitems");
        ArrayList<OrderItem> aravindsOrderItems = orderItemDm.getByOrderId(101);
        System.out.println(aravindsOrderItems);
        
        System.out.println("Indus orderitems");
        ArrayList<OrderItem> indusOrderItems = orderItemDm.getByOrderId(201);
        System.out.println(indusOrderItems);
        
        System.out.println("Akhilas orderitems");
        ArrayList<OrderItem> akhilasOrderItems = orderItemDm.getByOrderId(301);
        System.out.println(akhilasOrderItems);
    }
}


