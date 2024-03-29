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
public class Principal2 {
    
    public static void main(String[] args) {
        
        String path = "c:\\poo\\entrada2.txt";
        FileReader fr=null;
        BufferedReader br=null;
        
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
            //e.printStackTrace();
        } finally{
            try {
                if(br != null){
                   br.close();
                }
                if(fr != null){
                   fr.close(); 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }        
    }    
}
