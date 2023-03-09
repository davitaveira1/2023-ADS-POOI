/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author Davi
 */
import java.util.Locale;
import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int idade;
        double media;
        String nome;
        
        
        idade = entrada.nextInt(); 
        entrada.nextLine();
        nome = entrada.nextLine();        
        media = entrada.nextDouble();
        
        System.out.println("Idade: "+idade);
        System.out.println("Nome: "+nome);
        System.out.print("Media: "+media);
        
        
    }
    
}
