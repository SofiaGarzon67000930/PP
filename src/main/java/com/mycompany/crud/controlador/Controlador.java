/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.controlador;

import com.mycompany.crud.vista.Vista;
import com.mycompany.crud.modelo.Pagar;
import com.mycompany.crud.modelo.PagoDAO;
import com.mycompany.crud.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Araceli
 */
public class Controlador implements ActionListener{

    Pagar p= new Pagar();
    PagoDAO dao= new PagoDAO();
    Vista v= new Vista();

    public Controlador(Vista v) {
        this.v=v;
//        this.v.BBuy.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
