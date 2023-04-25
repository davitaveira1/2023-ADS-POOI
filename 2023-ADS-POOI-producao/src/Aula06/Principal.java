/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Professor p = new Professor("Davi", 39, "DAA", 1000);
        
        //p.idade = 41;
        p.setIdade(40);
        System.out.println("Idade: "+p.getIdade());
    }
    
}
