/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    public static void main(String[] args) {
        
        //int[] idade;
        //idade = new int[10];
        int i;
        int[] idade = new int[10];
        
        for(i=0;i < idade.length ; i++){
            idade[i] = i*10;            
        }
        
        System.out.println("Idade[3]: "+idade[3]);
        
        i=0;
        for(int x : idade){
            System.out.println("Posição: "+i+" Idade: "+x);
            i=i+1;
        }
        
        
        
        
    }
    
}
