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
public class OnlineShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Product p1 = new Product();
            Product p2 = new Product(15, "Game of thrones", "Novel written by RR Martin", 900, 1000);
            System.out.println(p1.toString());
            System.out.println(p2.toString());            
            
            System.out.println(p2.getDescription());
            
            PromotionalProduct pp1 = new PromotionalProduct();
            PromotionalProduct pp2 = new PromotionalProduct(15, "Game of thrones", "Novel written by RR Martin", 900, 1000, 15);
            System.out.println(pp1.toString());
            System.out.println(pp2.toString());            
               
          
        
            Customer c1 = new Customer(9, "Gordon", "Brown", "Home", 52031201, 1811);
            System.out.println(c1.toString());
           
            VIPCustomer c2 = new VIPCustomer(9, "Tushar", "Garg", "Home", 52031200, 1812, 12182016, 1,50);
            System.out.println(c2.toString());
            
            Product[] pro = {pp1,pp2, p2, p1};
            ShoppingCart sc1 = new ShoppingCart(c1, pro);
            System.out.println("The total price: "+sc1.calc());

            ShoppingCart sc2 = new ShoppingCart(c2, pro);
            System.out.println("The total price for VIP Customer: "+sc2.calc() * (1-(double)c2.getDiscountRate()/100));          
            
        }
}
        // TODO code application logic here
    
