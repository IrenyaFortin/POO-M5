/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2.m5.irenyafortin.pkg202410060535.Formas;

/**
 *
 * @author IRENYA FORTIN
 */
public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public void dibujar() {
        System.err.println("----TRIANGULO-----   ");

    }
    
    public double calcularArea(double b,double a) {
        
        return (b*a)/2; 
    }

    
}