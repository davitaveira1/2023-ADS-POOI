/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08;

/**
 *
 * @author Davi
 */
public class Turma {

    String curso;
    Professor professor;
    String sala;
    int Max_alunos;
    Aluno[] alunos;
    int qtdAlunos;

    public Turma(String curso, Professor professor, String sala, int Max_alunos) {
        this.curso = curso;
        this.professor = professor;
        this.sala = sala;
        this.Max_alunos = Max_alunos;
        alunos = new Aluno[Max_alunos];
    }

    void adicionarAluno(Aluno a) {
        if (qtdAlunos > Max_alunos) {
            System.out.println("Turma lotada! Aluno não adicionado!");
        } else {

            for (int i = 0; i < alunos.length; i++) {
                if (alunos[i] == null) {
                    alunos[i] = a;
                    break;
                }
            }
            System.out.println("Aluno inserido com sucesso!");

        }
    }

    void imprimir() {
        System.out.println("=====IMPRESSÃO=====");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                break;
            } else {
                System.out.println("Aluno: " + alunos[i].getNome());
            }

        }
        System.out.println("====FIM IMPRESSÃO====");
    }

}
