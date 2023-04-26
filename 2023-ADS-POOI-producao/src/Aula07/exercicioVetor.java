/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author Davi
 */
public class exercicioVetor {

    double[] vet = {12.1, 14.5, 40.2, 56.7, 21.9, 67.4, 34.1, 37.2, 77.9, 99.8};

    void imprimir() {
        System.out.println("*****INICIO IMPRESSÃO*****");
        for (double x : vet) {
            System.out.println(x);
        }
        System.out.println("*****FIM IMPRESSÃO*****");
    }

    void medias() {
        double soma = 0, media = 0;

        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        media = soma / vet.length;
        System.out.printf("Média aritmética: %.1f\n",media);

        soma=0;
        double mediaPonderada;
        double somaPesos=0;
        int[] pesos = {4, 3, 2, 5, 4, 6, 6, 7, 8, 2};

        for (int i = 0; i < vet.length; i++) {
            soma = soma + (vet[i]*pesos[i]);
            somaPesos = somaPesos + pesos[i];
        }
        mediaPonderada = soma/somaPesos;
        System.out.printf("Média ponderada: %.1f\n",mediaPonderada);

    }

    public static void main(String[] args) {
        exercicioVetor obj = new exercicioVetor();
        obj.imprimir();
        obj.medias();
    }

}
