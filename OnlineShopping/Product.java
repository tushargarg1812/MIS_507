/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;

/**
 *
 * @author tushargarg
 */
public class Product {
            private int id;
            private String name;
            private String description;
            public int price;
            private int stockQuantity;
            
            public Product(int id, String name, String description, int price, int stockQuantity){
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            this.stockQuantity = stockQuantity;   
            }
            
            public Product(){
                this(12, "Harry potter", "Novel written by J.K. Rowling", 1000, 100);
            }
            
            public void setName(String name){
                this.name = name;
            }
            public String getName(){
                return name;
            }           
            public void setDescription(String description){
                this.description = description; 
            }
            public String getDescription(){
                return description; 
            }
            public void setPrice(int price){
                this.price = price;
            }
            public double getPrice(){
                return price;
            }
            public void setQuantity(int stockQuantity){
                this.stockQuantity = stockQuantity;
            }
            public int getQuantity(){
                return stockQuantity;
            }  
            public String toString(){
                return "Product ID: "+id+". Name: "+name+ ". Description: "+description+ ". Price: "+price+ ". Stock Quantity: " +stockQuantity+ ".";
            }
             
}
