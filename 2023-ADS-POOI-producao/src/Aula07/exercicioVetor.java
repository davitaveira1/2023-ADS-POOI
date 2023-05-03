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
        System.out.printf("Média aritmética: %.1f\n", media);

        soma = 0;
        double mediaPonderada;
        double somaPesos = 0;
        int[] pesos = {4, 3, 2, 5, 4, 6, 6, 7, 8, 2};

        for (int i = 0; i < vet.length; i++) {
            soma = soma + (vet[i] * pesos[i]);
            somaPesos = somaPesos + pesos[i];
        }
        mediaPonderada = soma / somaPesos;
        System.out.printf("Média ponderada: %.1f\n", mediaPonderada);

    }

    void buscar(double valor) {
        int flag = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valor) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Encontrou o valor " + valor);
        } else {
            System.out.println("Não encontrou o valor " + valor);
        }
    }

    void excluir(double valor) {
        int flag = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valor) {
                vet[i] = -1;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("O " + valor + " foi excluído!");
        } else {
            System.out.println("O " + valor + " não foi encontrado!");
        }
    }

    void excluirPorPosicao(int pos) {
        int flag = 0;
        for (int i = 0; i < vet.length; i++) {
            if (i == pos) {
                vet[i] = -1;
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Posição encontrada e excluída! ");
        } else {
            System.out.println("Posição não foi encontrada");
        }

    }

    void qtdPosicoesDisponiveis() {
        int qtd = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == -1) {
                qtd++;
            }
        }
        System.out.println("Posições disponíveis: " + qtd);
    }

    void inserir(double valor) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == -1) {
                vet[i] = valor;
                break;
            }
        }
    }

    void inserirPorPosicao(int pos, double valor) {
        if (pos >= 0 && pos < vet.length) {
            vet[pos] = valor;
        }else{
            System.out.println("Posição inválida! Valor não inserido!");
        }

    }

    public static void main(String[] args) {
        exercicioVetor obj = new exercicioVetor();
        obj.imprimir();
        obj.medias();
        obj.buscar(50);
        obj.buscar(21.9);
        obj.excluir(12.1);
        obj.imprimir();
        obj.excluir(100);
        obj.excluirPorPosicao(0);
        obj.excluirPorPosicao(2);
        obj.excluirPorPosicao(4);
        obj.excluirPorPosicao(6);
        obj.imprimir();
        obj.qtdPosicoesDisponiveis();
        obj.inserir(10);
        obj.inserir(20);
        obj.inserir(30);
        obj.inserir(40);
        obj.imprimir();
        obj.inserirPorPosicao(9, 50);
        obj.imprimir();
        
    }

}
