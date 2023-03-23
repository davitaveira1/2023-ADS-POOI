/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
public class ex03_Principal {
    
    public static void main(String[] args) {
        
        ex03_Pessoa p1 = new ex03_Pessoa();
        ex03_Carro c1 = new ex03_Carro();
        
        p1.nome = "Davi";
        //relacionamento entre carro e pessoa
        c1.proprietario = p1;
        c1.nomeProprietario();
    }
    
}
