/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12;

import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            
            String[] vetor = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println("Pos: " + vetor[pos]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: "+e);
            System.out.println("Posição inválida!");
        } finally {
            sc.close();
            System.out.println("Final do programa!");
        }

    }

}
