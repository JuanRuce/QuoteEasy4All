/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.quoteeasy4all.component;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jruiz
 */
@Named
@RequestScoped
public class Labels {
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
