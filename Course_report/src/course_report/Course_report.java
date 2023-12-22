/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_report;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Course_report {

    public static void main(String[] args) 
    {
        int DISD = 1;
        int DIWD = 2;
        int DIDM = 3;
        Random rd =new Random();
        int nextInt = rd.nextInt(3)+1;
        Course_details obj = new Course_details();
        
       
         int number = Integer.parseInt(JOptionPane.showInputDialog("Select from the following view the course details: "+"\n"
                                     +"1)DISD"+"\n"
                                     +"2)DIWD"+"\n" 
                                     +"3)DIDM"));
       
       
        if(number ==1)
        {
   System.out.println("----------------------------------------------------"); 
      System.out.println("Course report -");
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
      System.out.println("Course:"+obj.getC_name());
  System.out.println("Student number:" +obj.getS_number());
      System.out.println("Lucture: "+obj.getL_name() );
  System.out.println("Venue:"+nextInt);
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  System.out.println("----------------------------------------------------");
        }else if(number == 2)
         {
    System.out.println("----------------------------------------------------"); 
      System.out.println("Course report -");
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
      System.out.println("Course:"+obj.getname());
  System.out.println("Student number: " +obj.getnumber());
      System.out.println("Lucture: " +obj.getLname());
  System.out.println("Venue: "+nextInt);
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  System.out.println("----------------------------------------------------");
         }
        else if(number == 3)
         {
    System.out.println("----------------------------------------------------"); 
      System.out.println("Course report -");
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
      System.out.println("Course:"+obj.getname2());
  System.out.println("Student number:"+obj.getno());
      System.out.println("Lucture: " +obj.getLname());
  System.out.println("Venue:"+nextInt);
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  System.out.println("----------------------------------------------------");
         }
        else
       {
         System.out.println("Thank you for your support");  
       }
    }
    
}
