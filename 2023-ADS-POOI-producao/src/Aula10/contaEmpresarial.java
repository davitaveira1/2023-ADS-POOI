/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula10;

/**
 *
 * @author Davi
 */
public class contaEmpresarial extends Conta{
    
    private double limite;

    public contaEmpresarial(double limite, int nroConta, String titular, double saldo) {
        super(nroConta, titular, saldo);
        this.limite = limite;
    }
    
    //taxa para saque do limite = R$ 10,00
    public void saqueDoLimite(double valor){        
        if(limite >= valor + 10){
            saldo = saldo + valor - 10;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    @Override
    public void saque(double valor){         
        
        if(saldo >= valor + 5 + 2){  
            super.saque(valor);
            saldo = saldo - 2;
        }
        
    }
    
    
    
}
