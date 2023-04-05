/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture10bills;


public class bills {
      private String strCustomer;
      private double dblMinutes, dblCost;
     
      //constructor recieving variables
    public bills (String strName, double dblMinutes, double dblCostPerMinute, double dblMinutesTalked) {
             strCustomer = strName;
             dblMinutes = dblMinutesTalked;
             dblCost = dblCostPerMinute;
   
        }
        
        public String getName(){
            return strCustomer;
        
        }
       
        public double getTotalBills(){
            return (dblMinutes * dblCost);
       
        }
    
    }
