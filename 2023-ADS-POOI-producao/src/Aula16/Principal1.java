/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula16;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Principal1 {

    public static void main(String[] args) {

        File file = new File("c:\\poo\\entrada.txt");
        Scanner sc = null;

        try {            
            sc = new Scanner(file);
            
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
        } catch (IOException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally{
            if(sc!=null){
                sc.close();
            }            
        }

    }

}
