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
public class VIPCustomer extends Customer {
            private int vipDate;
            private int vipLevel;
            private int discountRate; 
            
            public VIPCustomer(){
                super();
                vipDate = 01012017;
                vipLevel = 5;
                discountRate = 10;
            }
            public VIPCustomer(int i, String f, String l, String a, int tel, int reg, int vD, int vL, int dis){
                super(i,f,l,a,tel,reg);
                vipDate = vD;
                vipLevel = vL;
                discountRate = dis;            
            }
            public void setDiscountRate(int n){
                discountRate = n;
            }
            public int getDiscountRate(){
                return discountRate;
            }
            public String toString(){
                String s = super.toString();
                s += "Vip Date: " +vipDate+ "." + "Vip Level: " +vipLevel+ "." + "discountRate: " +discountRate+ ".";
                return s;
            }

            
}
