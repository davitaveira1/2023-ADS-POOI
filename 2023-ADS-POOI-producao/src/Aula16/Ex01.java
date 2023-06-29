/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    public static void main(String[] args) {
        
        String path = "c:\\poo\\arq.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            while(line != null){
                
                String[] parametros = line.split(",");
                System.out.println("Prof: "+parametros[0]);
                System.out.println("Disciplina: "+parametros[1]);
                System.out.println("Alunos: "+parametros[2]);
                line = br.readLine();
                
            }            
            
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        }         
        
    }
    
}
