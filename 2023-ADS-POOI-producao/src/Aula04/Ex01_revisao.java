/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
public class Ex01_revisao {
    
    String nroConta;
    double saldo;
    
    void visualizarSaldo(){
        System.out.println("Saldo da conta: "+saldo);
    }
    
    public static void main(String[] args) {
        
        Ex01_revisao c1 = new Ex01_revisao();
        
        c1.nroConta = "231-09";
        c1.saldo = 3000;
        
        c1.visualizarSaldo();
        
    }
    
}
