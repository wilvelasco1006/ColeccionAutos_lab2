/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.AutoGUI;
import modelo.Auto;
import modelo.Coleccion;
/**
 *
 * @author wilme
 */
public class ControlAutoGUI implements ActionListener{
    Auto model;
    AutoGUI view;
    Coleccion miColeccion;
    
    ///constructor
    public ControlAutoGUI(Auto model, AutoGUI view) {
        this.model = model;
        this.view = view;
        this.view.btn_AgregraAuto.addActionListener(this);
        this.view.btn_BorrarAuto.addActionListener(this);
        this.view.btn_ListarColeccion.addActionListener(this);
        this.view.btn_BuscarAuto.addActionListener(this);
        this.view.btn_Salir.addActionListener(this);
        miColeccion = new Coleccion();
    }

    public ControlAutoGUI() {
    }

  
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btn_AgregraAuto){
            agregarAuto();
        } else if (e.getSource() == view.btn_BorrarAuto) {
            borrarAuto();
        } else if (e.getSource() == view.btn_ListarColeccion) {
            listarAutos();
        } else if (e.getSource() == view.btn_BuscarAuto) {
            buscarAuto();
        } else if (e.getSource() == view.btn_Salir) {
            System.exit(0);
        }
        
       
       
    }
    public void agregarAuto() {
        int anioSerie;
        String marca;
        String color;
        int canTotal;
        int numSerie;

        anioSerie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de la serie", "Ingreso de atributos", JOptionPane.PLAIN_MESSAGE));
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca del auto", "Ingreso de atributos", JOptionPane.PLAIN_MESSAGE);
        color = JOptionPane.showInputDialog(null, "Ingrese el color del auto", "Ingreso de atributos", JOptionPane.PLAIN_MESSAGE);
        canTotal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de autos de la serie", "Ingreso de atributos", JOptionPane.PLAIN_MESSAGE));
        numSerie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del auto dentro de la serie", "Ingreso de atributos", JOptionPane.PLAIN_MESSAGE));

        Auto miAuto = new Auto();
        miAuto.setAnioSerie(anioSerie);
        miAuto.setMarca(marca);
        miAuto.setColor(color);
        miAuto.setCanTotal(canTotal);
        miAuto.setNumSerie(numSerie);
        miColeccion.agregarAuto(miAuto);

    }

    public void borrarAuto() {
        int anioSerie;
        int numSerie;
        int resultado = 0;
        anioSerie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de la serie", "Ingreso de valores", JOptionPane.PLAIN_MESSAGE));
        numSerie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del auto dentro de la serie", "Ingreso de valores", JOptionPane.PLAIN_MESSAGE));

        resultado = miColeccion.borrarAuto(anioSerie, numSerie);
        if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "Auto Borrado con Éxito", "Resultado =)", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Auto no Encontrado", "Resultado =)", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void listarAutos() {
        JOptionPane.showMessageDialog(null, miColeccion.listarColeccion(), "Resultado =)", JOptionPane.PLAIN_MESSAGE);
    }

    public void buscarAuto() {
        int anioSerie;
        int numSerie;

        anioSerie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de la serie", "Ingreso de valores", JOptionPane.PLAIN_MESSAGE));
        numSerie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del auto dentro de la serie", "Ingreso de valores", JOptionPane.PLAIN_MESSAGE));

        JOptionPane.showMessageDialog(null, miColeccion.buscarAuto(anioSerie, numSerie), "Resultado =)", JOptionPane.PLAIN_MESSAGE);

    }
}


    
    
    

