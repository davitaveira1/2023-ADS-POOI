/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11;

/**
 *
 * @author Davi
 */
public class Gerente extends Funcionario {
    
    int senha;
    int nroFuncionarioGerenciados;
    
    public boolean autentica(int senha){
        if(senha == this.senha)
            return true;
        else
            return false;
    }
    
    @Override
    public double getBonificacao(){
        return salario*0.15;
    }
    
}
