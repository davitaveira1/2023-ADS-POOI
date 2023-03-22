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
    
    String nomeTitular;
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
    
    
    void transferir(Conta contaCreditada,double valor){
        if(saldo >= valor){
            //debitar
            saldo = saldo - valor;
            //creditar
            contaCreditada.saldo = contaCreditada.saldo + valor;            
        }else{
            System.out.println("Saldo insuficiente!");
            System.out.println("Valor do débito: "+valor);
        }
        
        System.out.println(nomeTitular+ ": Saldo conta creditada = "+contaCreditada.saldo);
        System.out.println(contaCreditada.nomeTitular+ ": Saldo conta debitada = "+saldo);
        
    }


    public static void main(String[] args) {
        Conta contaDavi = new Conta();
        Conta contaLucas = new Conta();
        
        contaDavi.nomeTitular = "Davi";
        contaLucas.nomeTitular = "Lucas";
        
        contaDavi.saldo = 2000;
        
        contaDavi.transferir(contaLucas, 1000);
        
        
        
    }
    
}
