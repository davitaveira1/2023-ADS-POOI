/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author Davi
 */
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        double media;

        System.out.println("Informe o seu nome, idade e média: ");
        nome = entrada.next();
        idade = entrada.nextInt();
        media = entrada.nextDouble();        

        
        //System.out.println("Valores digitados: " +nome+"\n"+idade+"\n"+media);
        //System.out.print("Valores digitados: \n"+nome+"\n"+idade+"\n"+media);
        System.out.printf("Valores digitados: \n"+nome+"\n"+idade+"\n"+media+"\n");

    }

}
