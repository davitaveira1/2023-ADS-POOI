/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula09;

/**
 *
 * @author Davi
 */
public class Triangulo {
    
    double ladoA,ladoB,ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public double calcularArea(){
        
        double p,area;
        p = (ladoA+ladoB+ladoC)/2;
        area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));        
        return area;
        
    }
    
    public static void main(String[] args) {
        Triangulo tx = new Triangulo(3, 4, 5);
        Triangulo ty = new Triangulo(7.5, 4.5, 4.02);
        
        System.out.printf("Area triângulo X: %.2f\n",tx.calcularArea());
        System.out.printf("Area triângulo Y: %.2f\n",ty.calcularArea());
        
        if(tx.calcularArea() > ty.calcularArea())
            System.out.println("Maior area: Triângulo X\n");
        else
            System.out.println("Maior area: Triângulo Y\n");
    }
}
