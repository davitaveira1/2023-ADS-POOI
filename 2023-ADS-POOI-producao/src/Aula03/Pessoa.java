/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author Davi
 */
public class Pessoa {
    
    String nome;
    String telefone;
    String cpf;
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome="Davi";
        p1.telefone="(62)98513-0090";
        p1.cpf="908.908.898-99";
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("Telefone: "+p1.telefone);
        System.out.println("CPF: "+p1.cpf);
    }
    
}
