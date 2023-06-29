/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Davi
 */
public class Principal4 {
    
    public static void main(String[] args) {
        
        String[] lines = new String[]{"Bom dia!","Boa tarde!","Boa noite!"};
        String path = "c:\\poo\\saida.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        }
        
    }
    
}
