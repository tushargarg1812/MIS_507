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
public class ShoppingCart {
    private Customer cus;
    private Product[] pro;
    
    public ShoppingCart(){
    }
    
    public ShoppingCart(Customer c, Product[] p){
        cus = c;
        pro = p;
    }
    public int calc(){
        int sum = 0;
        for(int i=0; i<pro.length; i++){
            sum += pro[i].getPrice();
        }
        return sum;
    }
    
}
