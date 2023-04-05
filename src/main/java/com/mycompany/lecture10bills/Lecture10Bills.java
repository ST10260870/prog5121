/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10bills;
import javax.swing.*;

public class Lecture10Bills {


   public static void main(String [] args) {
      String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
      double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the minutes talked"));
      double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minutes talked"));
 
      //sends variables to constructor in the bills class
      bills b = new bills(strName, dblMinutesTalked, dblCostPerMinute, dblMinutesTalked) ; 
      JOptionPane.showMessageDialog(null, "Customer NAME;" +
              b.getName().toUpperCase() + "\n" +
              "Total Due: R " + b.getTotalBills());
   
   
   
   
   }
}
