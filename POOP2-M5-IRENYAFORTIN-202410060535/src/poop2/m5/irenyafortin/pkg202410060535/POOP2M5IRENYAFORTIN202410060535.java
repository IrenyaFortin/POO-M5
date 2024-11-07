/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2.m5.irenyafortin.pkg202410060535;

import java.util.Scanner;
import poop2.m5.irenyafortin.pkg202410060535.Formas.Circulo;
import poop2.m5.irenyafortin.pkg202410060535.Formas.Cuadrado;
import poop2.m5.irenyafortin.pkg202410060535.Formas.Linea;
import poop2.m5.irenyafortin.pkg202410060535.Formas.Triangulo;

/**
 *
 * @author IRENYA FORTIN
 */
public class POOP2M5IRENYAFORTIN202410060535 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int salida = 0;
    String colorfigura="";
 while (salida == 0) {
            System.out.println("---Sistema de Figuras---");
            System.out.println("Seleccione la figura que desea:");
            System.out.println("1. Circulo");
            System.out.println("2. Linea");
            System.out.println("3. Triangulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Salir");
            

            System.out.print("Opcion: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if(opcion>=1 && opcion<=4){
            System.out.println("-----------------------------");
            System.out.println("Escriba el color que desea para la figura:");
            colorfigura = entrada.nextLine();
            }
            
             switch (opcion) {
                case 1:
                    System.out.println("-----------CIRCULO-----------");
                    System.out.print("Indique ahora el diametro del Circulo: ");
                    double radio = entrada.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    circulo.establecerColor(colorfigura);
                    System.out.println("El color de su Circulo es: " + colorfigura);
                    System.out.println("Radio del Circulo: " + circulo.calcularRadio());
                    circulo.dibujar();
                    break;

                case 2:
                    System.out.println("-----------LINEA-----------");
                    System.out.print("Indique ahora el largo de la Linea en cm: ");
                    int largo = entrada.nextInt();
                    Linea linea = new Linea(largo);
                    linea.establecerColor(colorfigura);
                    System.out.println("El color de su Linea es: " + colorfigura);
                    System.out.print("Linea de " + largo);
                    linea.dibujar();
                    break;

                case 3:
                    System.out.println("-----------TRIANGULO-----------");
                    System.out.print("Ingrese el angulo del Triangulo: ");
                    double angulo = entrada.nextDouble();
                    Triangulo triangulo = new Triangulo(angulo);
                    System.out.print("Ingrese el valor de la base ");
                    double base = entrada.nextDouble();
                    System.out.print("Ingrese el valor de la altura ");
                    double altura = entrada.nextDouble();
                    System.out.println("El color de su triangulo es: " + colorfigura);
                    triangulo.establecerColor(colorfigura);
                    triangulo.dibujar();
                    System.out.println("Area del Triangulo: " + triangulo.calcularArea(base,altura));
                    break;

                case 4:
                    System.out.println("-----------CUADRADO-----------");
                    Cuadrado cuadrado = new Cuadrado();
                    System.out.println("El color de su Cuadrado es: " + colorfigura);
                    cuadrado.establecerColor(colorfigura);
                    cuadrado.dibujar();
                    System.out.print("Ingrese el valor del lado del cuadrado: ");
                    double lado = entrada.nextDouble();
                    System.out.println("Area del Cuadrado calculado: " + cuadrado.calcularArea(lado));
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema de figuras");
                    salida = 1;
                    break;

                default:
                    System.out.println("Ingreso un valor fuera del rango de opciones.");
            }
        }

        entrada.close();
    }
}