/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controlador.ControlAutoGUI;
import vista.AutoGUI;

/**
 *
 * @author wilme
 */
public class Principal {
    public static void main(String[] args) {
     
        AutoGUI vista = new AutoGUI();
        ControlAutoGUI control = new ControlAutoGUI();
        vista.setVisible(true);
        
        
    }   
}
