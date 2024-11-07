/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m5.irenyafortin.pkg202410060535.Formas;

/**
 *
 * @author IRENYA FORTIN
 */
public class Cuadrado extends Formas {
    private double area;

     @Override
    public void dibujar() {
       System.err.println("----CUADRADO-----   ");

    }
       public double calcularArea(double l) {
        area = l*l;
        return area;
    }

   
}