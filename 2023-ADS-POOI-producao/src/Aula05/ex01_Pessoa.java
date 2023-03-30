/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Davi
 */
public class ex01_Pessoa {
    
    String nome;
    String cpf;

    ex01_Pessoa(String nomePessoa, String cpfPessoa) {
        nome = nomePessoa;
        cpf = cpfPessoa;
    }
    
    void nomePessoa(){
        System.out.println("Nome: "+nome);
    }
    
    
    
}
