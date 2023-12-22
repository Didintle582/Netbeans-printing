/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Printing 
{

  public static void main(String[] args) 
   {
         PrintDetails();
         
         
   }
      public static void PrintDetails()
    { 
      int yes = 1;
       Custome_purchase obj = new Custome_purchase();
        Scanner input = new Scanner(System.in);
       System.out.println("Customer invoice");
   System.out.println("----------------------------------------------------");
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  System.out.println("Customer number:" +obj.getidNumber());
      System.out.println("Customer first name:" +obj.getName());
  System.out.println("Customer Surname:" +obj.getSurname());
      System.out.println("Productt Price: R" +obj.getPrice());
  System.out.println("Product quantity:"+obj.getQuantity());
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  System.out.println("----------------------------------------------------");
  
      System.out.println("Would you like to view the product purchase report?Enter (1)"
                        + "to view the purchase report or any other key to exit");
      yes = input.nextShort();
      
      if(yes == 1)
      {
          System.out.println("----------------------------------------------------");
          System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
          System.out.println("Product price:" +obj.getPrice());
          System.out.println("Tax:" +obj.getTax());
          System.out.println("Commission:" +obj.getCommission());
          System.out.println("Discount: R" +obj.getdiscount());
          System.out.println("Total: R"+obj.getTotal());
          System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
          System.out.println("----------------------------------------------------");
      } 
      else   
      {
       System.out.println("Thank you for your support");   
      }
             
      
}
}