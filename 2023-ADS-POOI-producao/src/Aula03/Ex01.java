/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    String nroConta;
    double saldo;
    
    public static void main(String[] args) {
        
        Ex01 conta1 = new Ex01();
        //Ex01 conta1;
        //conta1 = new Ex01();
        conta1.nroConta = "16.346-5";
        conta1.saldo = 1000.89;
        
        System.out.println("Nº conta: "+conta1.nroConta);
        System.out.println("Saldo: "+conta1.saldo);
    }
    
}
