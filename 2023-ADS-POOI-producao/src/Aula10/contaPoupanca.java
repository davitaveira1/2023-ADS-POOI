/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula10;

/**
 *
 * @author Davi
 */
public class contaPoupanca extends Conta{

    public contaPoupanca(int nroConta, String titular, double saldo) {
        super(nroConta, titular, saldo);
    }
    
    @Override
    public void saque(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }        
    }
    
}
