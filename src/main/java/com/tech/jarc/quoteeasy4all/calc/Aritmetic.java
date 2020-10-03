/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.quoteeasy4all.calc;

/**
 *
 * @author jruiz
 */
public class Aritmetic {
    
    public double opration (String typeOper, double v1, double v2){
        double result = 0;
        
        switch(typeOper){
            
            case "Plus":
               result = v1 + v2;
                
            break;
            case "Menus":
                result = v1 - v2;
            break;    
            
        }
        return result;
    }
}
