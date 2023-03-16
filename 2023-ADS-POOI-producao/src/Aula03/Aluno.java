/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author Davi
 */
public class Aluno {
    
    String nome;
    String telefone;
    String matricula;
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome="Lucas";
        a1.telefone="(62)8989-0110";
        a1.matricula="8989-1";
        
        System.out.println("Nome: "+a1.nome);
        System.out.println("Telefone: "+a1.telefone);
        System.out.println("Matricula: "+a1.matricula);
    }
    
}
