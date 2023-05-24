/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula10;

/**
 *
 * @author Davi
 */
public class Conta {
    
    private int nroConta;
    private String titular;
    protected double saldo;

  
    public Conta(int nroConta, String titular, double saldo) {
        this.nroConta = nroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //taxa de R$ 5 para saque
    public void saque(double valor){
        if(saldo >= valor + 5){
            saldo = saldo - (valor + 5);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    
    
}
