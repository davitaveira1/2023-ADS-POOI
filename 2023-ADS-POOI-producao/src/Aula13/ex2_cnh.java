/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula13;

/**
 *
 * @author Davi
 */
public class ex2_cnh {

    public String expedirCNH(int idade) {

        if (idade >= 18) {
            return "CNH será expedida!";
        } else {
            return "CNH não será expedida!";
        }
        
    }
    
    public void expedirCNH_excecao(int idade){
        
        if(idade >= 18){
            System.out.println("CNH expedida com sucesso!");
        }else{
            throw new IllegalArgumentException();
        }
    }

}
