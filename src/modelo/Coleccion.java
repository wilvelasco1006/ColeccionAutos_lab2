/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilme
 */
public class Coleccion {
    // atributos
    private List<Auto> autos = new ArrayList<>();

    // constructor
    public Coleccion() {}

    // métodos
    public void agregarAuto(Auto carrito) {
        autos.add(carrito);
    }

    public int borrarAuto(int anioSerie, int numSerie) {
        for (int i = 0; i < autos.size(); i++) {
            Auto unCarro = autos.get(i);

            if (unCarro.getAnioSerie() == anioSerie && unCarro.getNumSerie() == numSerie) {
                autos.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public String listarColeccion() {
        StringBuilder coleccion = new StringBuilder();
        for (Auto unCarro : autos) {
            coleccion.append("Año Serie: ").append(unCarro.getAnioSerie()).append(" - ")
                     .append("Marca: ").append(unCarro.getMarca()).append(" - ")
                     .append("Color: ").append(unCarro.getColor()).append(" - ")
                     .append("cantTotalSerie: ").append(unCarro.getCanTotal()).append(" - ")
                     .append("numeroSerie: ").append(unCarro.getNumSerie()).append("\n");
        }
        return coleccion.toString();
    }

    public String buscarAuto(int anioSerie, int numSerie) {
        StringBuilder datosAuto = new StringBuilder("El auto no se encuentra");

        for (Auto unCarro : autos) {
            if (unCarro.getAnioSerie() == anioSerie && unCarro.getNumSerie() == numSerie) {
                datosAuto.setLength(0); // Clearing previous "El auto no se encuentra" message
                datosAuto.append("Año Serie: ").append(unCarro.getAnioSerie()).append("\n")
                         .append("Marca: ").append(unCarro.getMarca()).append("\n")
                         .append("Color: ").append(unCarro.getColor()).append("\n")
                         .append("cantTotalSerie: ").append(unCarro.getCanTotal()).append("\n")
                         .append("numeroSerie: ").append(unCarro.getNumSerie()).append("\n");
                return datosAuto.toString();
            }
        }
        return datosAuto.toString();
    }
    
}

    
