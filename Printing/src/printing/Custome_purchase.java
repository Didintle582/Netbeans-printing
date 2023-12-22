/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Custome_purchase 
{
     private int C_number;
     private String name;
     private String surname;
     private String P_name;
     private double P_price;
     private int quantity;
     private double total;
     private double tax;
     private double commission;
     private double Discount;
     private String yes;
    public Custome_purchase()
   {
      C_number = 0;
      name = null;
      surname = null;
      P_name = null;
      P_price = 0.0;
      quantity = 0;
      
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter customer number >>>>>");
           C_number = input.nextShort();
      System.out.println("Enter customer first name >>>>>");
           name = input.next();
      System.out.println("Enter customer surname >>>>>");
           surname = input.next();
      System.out.println("Enter the Product >>>>>");
           P_name = input.next();
      System.out.println("Enter the product price >>>>>");
           P_price = input.nextDouble();
      System.out.println("Enter Quantity required >>>>>");
           quantity = input.nextShort();       
   }
    //Set methods
    public void setCNumber(int num)
   {
      C_number = num;   
   }
    public void setName(String n)
   {
      name = n;   
   }
    public void setSurname(String sur)
   {
      surname = sur;
   }
    public void setPname(String Pn)
    {
        P_name = Pn;
    }
    public void setP_price(double p)
   {
      P_price = p; 
   } 
    public void setqunatity(int q)
    {
        quantity = q;
    }
    
    //get methods
    public int getidNumber()
   {
       
       return C_number;
   }
    public String getName() 
   {
       return name;
   }
    public String getSurname()
   {
       return surname;
   }
    public String getPname()
   {
      return P_name; 
   }
    
   public double getPrice()
   {
       return P_price*quantity;
   }
   public int getQuantity()
   {
       return quantity;
   }
    public double getTax() 
   {
      tax = (P_price*quantity) *0.15 ;
      return tax;
   }
    public double getCommission()
   {
     commission =( P_price * quantity) *00.85;
     return commission;
   }
    public double getdiscount()
    {
        Discount = P_price*quantity*0.1;
        return Discount;
    }
    
    public double getTotal()
    {
       total = (P_price + tax -Discount+commission);
       return total;
    }
   
}