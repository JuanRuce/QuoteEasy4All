/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.quoteeasy4all.component;


import com.tech.jarc.quoteeasy4all.calc.Aritmetic;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jruiz
 */
@Named
@RequestScoped
public class ButtonView {
    Aritmetic obj = null;
    Labels lb= null;
    
    public ButtonView(){
        obj = new Aritmetic();
        lb = new Labels();
    }
 
    public void buttonAction() {
       lb.setDescription(String.valueOf(obj.Plus(4,5)));
       
    }
 
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
