/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Professor p1 = new Professor("Davi");
        Aluno a1 = new Aluno("Lucas");
        Aluno a2 = new Aluno("Ricardo");
        
        Turma poo = new Turma("ADS", p1, "103", 10);
        poo.adicionarAluno(a1);
        poo.adicionarAluno(a2);        
        poo.imprimir();
        poo.alterarAluno("Lucas","Lucas Souza");
        poo.imprimir();
        poo.excluirAluno("Lucas Souza");
        poo.imprimir();
        System.out.println(poo.alunos);
        
    }
    
}
