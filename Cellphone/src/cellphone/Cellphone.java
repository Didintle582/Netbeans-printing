/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphone;

import java.util.Random;
import javax.swing.JOptionPane;
public class Cellphone {

 
    public static void main(String[] args) 
    {
      
      String []network;
      network = new String[3];
      network[0]="CELL C";
      network[1]="VODACOM";
      network[2]="MTN";
       
      String cellc ="084";
      String MTN ="083";
      String Vodacom = "072";
      
      int random = (int)(Math.random()*3);
      String name;
      String name1;
      String name2;
      Random rd = new Random(); 
      int nextInt = rd.nextInt(1000000);
     
       name = JOptionPane.showInputDialog("Please enter first employees name");
       name1 = JOptionPane.showInputDialog("Please enter second employees names");
       name2 = JOptionPane.showInputDialog("Please enter third employees names ");
       
       if(network.equals("CELL C"))
       {
          JOptionPane.showMessageDialog(null, name+" will be on the "+network[random]+cellc+nextInt*7+"\n"
                                    +name1+" will be on the "+network[random]+cellc+nextInt*7+"\n"
                                    +name2+" will be on the "+network[random]+cellc+nextInt*7); 
       }else if(network.equals("VODACOM"))
       {
           JOptionPane.showMessageDialog(null, name+" will be on the "+network[random]+" with the phone number "+Vodacom+nextInt*7+"\n"
                                    +name1+" will be on the "+network[random]+Vodacom+nextInt*7+"\n"
                                    +name2+" will be on the "+network[random]+Vodacom+nextInt*7);
       }
      else if(!network.equals("MTN"))
       
       {
          JOptionPane.showMessageDialog(null, name+" will be on the "+network[random]+MTN+nextInt*7+"\n"
                  +name1+" will be on the "+network[random]+MTN+nextInt*7+"\n"
                  +name2+" will be on the "+network[random]+MTN+nextInt*7);
      }
       
       
JOptionPane.showMessageDialog(null, name+" will be on the "+network[random]+" with the phone number "+MTN+nextInt*7+"\n"
                                    +name1+" will be on the "+network[random]+" with the phone number "+MTN+nextInt*7+"\n"
                                    +name2+" will be on the "+network[random]+" with the phone number "+MTN+nextInt*7);
    
}}
