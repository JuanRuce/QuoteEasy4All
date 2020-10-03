/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.quoteeasy4all.component;

import com.tech.jarc.quoteeasy4all.calc.Aritmetic;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jruiz
 */

@Named
@RequestScoped
@ManagedBean

public class QuoteEntity {
    
    double operadorUno;
    double operadorDos;
    double resultCalc;
    String typeOperation;
    Aritmetic ar;
    
    public QuoteEntity(){
        operadorUno = 0; operadorDos = 0; resultCalc = 0; ar = new Aritmetic(); typeOperation = "Plus";
    }
    
    public void executeOperation(){
        resultCalc = ar.opration(typeOperation, operadorUno, operadorDos);     
    }
    
    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }
    
                
    public double getOperadorUno() {
        return operadorUno;
    }

    public void setOperadorUno(double operadorUno) {
        this.operadorUno = operadorUno;
    }

    public double getOperadorDos() {
        return operadorDos;
    }

    public void setOperadorDos(double operadorDos) {
        this.operadorDos = operadorDos;
    }

    public double getResultCalc() {
        return resultCalc;
    }

    public void setResultCalc(double resultCalc) {
        this.resultCalc = resultCalc;
    }
    
}
