/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Locale;

/**
 *
 * @author Davi
 */
public class Ex04 {

    public static void main(String[] args) {
        String p1 = "Computador";
        String p2 = "Mesa";

        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.0;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.println(p1 + ", preco: " + preco1);
        System.out.println(p2 + ", preco: " + preco2);
        
        System.out.println("\nRegistro: " + idade + " anos, codigo " + codigo + " sexo " + sexo);
        System.out.printf("\nMedida: %.8f\n",medida);
        System.out.printf("Medida: %.3f\n",medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida: %.8f\n",medida);
        
    }

}
