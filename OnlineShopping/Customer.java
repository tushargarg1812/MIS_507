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
public class Customer {
            private int id;
            private String firstName;
            private String lastName;
            private String address;
            private int telephone;
            private int registrationDate;
            
            public Customer(){
            }
            
            public Customer(int i, String f, String l, String a, int tel, int reg){
                id = i;
                firstName = f;
                lastName = l;
                address = a;
                telephone = tel;
                registrationDate = reg;
            }
            public void setName(String s){
                firstName = s;
            }
            public String getName(){
                return firstName;
            }            
            public void setTel(int t){
                telephone = t;
            }
            public int getTel(){
                return telephone;
            }
             public String toString(){
                return "Customer firstname is: " + firstName +"."+ " Customer lastName is: " +lastName+"." +" The telephone number is: " + telephone + ".";
            }         
}
