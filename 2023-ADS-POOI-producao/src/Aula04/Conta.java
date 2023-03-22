/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
public class Conta {
    
    String nConta;
    double saldo;
    
    void creditar(double valor){
        saldo = saldo + valor;
        System.out.println("Saldo atual: "+saldo);
    }
    
    void debitar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;            
        }else{            
            System.out.println("Saldo insuficiente!");
            System.out.println("Valor débito: "+valor);
            
        }
        System.out.println("Saldo atual: "+saldo);
    }
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        //c1.saldo = 500;
        //c1.creditar(1000);
        
    }
    
}
