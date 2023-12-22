/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_report;

/**
 *
 * @author PC
 */
class Course_details 
{
 private String C_name;
 private String name;
 private String name2;
 private String L_name;
 private String lname;
 private String Name;
 private int num;
 private int S_number;
 private int  no;
 public Course_details()
 {
     C_name = "Diploma in software development";
     name = "Diploma in web development";
     name2 = "Diploma in data metric";
     
     S_number = 35;
     num = 28;
     no = 39;
     
 
     L_name = "Mr Jones";
     lname ="Mr smith" ;
     Name = "Mrs Ntsinga";
 }
 public void setCname(String n)
 {
      C_name= n;
      
 }
  public void setnum(int no)
 {
     S_number = no;
 }
   public void setLname(String l)
 {
     L_name=l;
 }
  public String getC_name()
  {
    
      return C_name;
  }
  public int getS_number()
  {
      
      return S_number;
  }
  public String getL_name()
  {
      return L_name;
  }
  
  
  
   public String getname()
  {
      return name;
  }
  public int getnumber()
  {
      
      return num;
  }
  public String getLname()
  {
      return Name;
  }
  
  
  
  
  
   public String getname2()
  {
    
      return name2;
  }
  public int getno()
  {
      
      return no;
  }
  public String getName()
  {
      return Name;
  }
}

