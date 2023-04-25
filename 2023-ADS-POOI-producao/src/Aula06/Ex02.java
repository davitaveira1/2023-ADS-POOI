/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Ex02 {
    
    public static void main(String[] args) {
        
        int[] idade = new int[5];
        
        idade[0]=10;
        idade[1]=20;
        idade[2]=30;
        idade[3]=40;
        idade[4]=50;   
        
        int flag=0;
        for(int i=0;i<idade.length;i++){
            if(idade[i]==100){
                //System.out.println("Existe!");
                flag=1;
            }
        }
        
        if(flag==1){
            System.out.println("Existe!");
        }else{
            System.out.println("Não existe!");
        }
            
        
        
    }
    
}
