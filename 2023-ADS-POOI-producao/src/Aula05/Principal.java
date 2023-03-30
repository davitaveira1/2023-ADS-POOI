/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Disciplina d = new Disciplina();
        
        a.nome = "Davi";
        d.nomeDisciplina = "POO I";
        
        a.mediaFinal(d, 8.4);
    }
    
}
