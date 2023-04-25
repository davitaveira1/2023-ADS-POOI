/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Vetor {
    
    void imprimirVetor(int[] vet){
        
        for(int i=0;i < vet.length;i++){
            System.out.println("vet["+i+"]: "+vet[i]);
        }
        
    }
    
    public static void main(String[] args) {
        
        Vetor v = new Vetor();
        int[] idade = new int[2];
        idade[0] = 45;
        idade[1] = 50;
        
        v.imprimirVetor(idade);
        
        String[] nome = new String[4];
        nome[0] = "Davi";
        nome[1] = "Daniel";
        nome[2] = "Rafael";
        nome[3] = "Marcelo";
        
        int i=0;
        while(i<nome.length){
            System.out.println(nome[i]);
            i++;
        }
        
        
    }
    
}
