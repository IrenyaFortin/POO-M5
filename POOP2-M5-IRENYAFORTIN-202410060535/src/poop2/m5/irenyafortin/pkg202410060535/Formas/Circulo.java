/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m5.irenyafortin.pkg202410060535.Formas;

/**
 *
 * @author IRENYA FORTIN
 */
public class Circulo extends Formas {
    
private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

 @Override
    public void dibujar() {
        System.err.println("----CIRCULO-----   ");
        
    }


    public double calcularRadio() {
        radio=radio/2;
        return radio;
    }

   
   
}