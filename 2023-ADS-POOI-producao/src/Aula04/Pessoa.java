/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Davi
 */
public class Pessoa {
    
    String nome;
    
    void filiacao(Pessoa pai, Pessoa mae){
        System.out.println("Filho: "+nome);
        System.out.println("Pai: "+pai.nome);
        System.out.println("Mae: "+mae.nome);
    }
    
    public static void main(String[] args) {
        Pessoa filho = new Pessoa();
        Pessoa pai = new Pessoa();
        Pessoa mae = new Pessoa();
        
        filho.nome = "Davi";
        pai.nome = "João";
        mae.nome = "Neide";
        
        //filho.filiacao(pai, mae);
        
        System.out.println("Filho: "+filho.nome);
        System.out.println("Pai: "+pai.nome);
        System.out.println("Mae: "+mae.nome);
    }
    
}
