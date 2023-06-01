/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula13;

/**
 *
 * @author Davi
 */
public class ex1_principal {

    public static void main(String[] args) {

        ex1_usuario user = new ex1_usuario(15);
        ex2_cnh cnh = new ex2_cnh();

        /*
        System.out.println(
            cnh.expedirCNH(user.getIdade())
        );
         */
        try {
            cnh.expedirCNH_excecao(user.getIdade());
        } catch (IllegalArgumentException e) {
            System.out.println("CNH não foi expedida!");
        }

    }

}
