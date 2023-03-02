/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author Davi
 */
import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        /*
        String nome;
        double altura;
        double distancia_cm;
        int idade;
        double volume_lt;
        int qtdfilhos;
        boolean arquivo;
        
        nome="davi";
        altura=1.89;
        distancia_cm = 3.18;
        qtdfilhos = 5;
        arquivo = false;
        */
        
        String nome,sobrenome;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        nome = entrada.next();
        System.out.println("Informe o sobrenome: ");
        sobrenome = entrada.next();
        //System.out.println("O nome digitado é: "+nome);
        System.out.println(nome);
        System.out.println(sobrenome);
                
    }
    
}
