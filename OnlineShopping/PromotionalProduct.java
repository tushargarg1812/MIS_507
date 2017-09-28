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
public class PromotionalProduct extends Product {
    private int discountRate;
    
    public PromotionalProduct(int id, String name, String description, int price, int stockQuantity, int discountRate){
        super(id, name, description, price, stockQuantity);
        this.discountRate = discountRate;
    }
    public PromotionalProduct(){
        super();
        discountRate = 10;
    }
    public void setDiscountRate(int n){
        discountRate = n;
    }
    
    public int getDiscountRate(){
        return discountRate;
    }
    
    public double getPrice(){
        return price*(1-(double)discountRate/100);
    }

    public String toString(){
        String s = super.toString();
        s += "The discount rate is: " + discountRate + "%.";
        return s;
    }    
    
}
