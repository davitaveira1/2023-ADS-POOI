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
                    qtdAlunos++;
                    break;
                }
            }
            System.out.println("Aluno inserido com sucesso!");

        }
    }

    void imprimir() {
        System.out.println("\n=====DADOS DA TURMA=====");
        System.out.println("Curso: "+curso);
        System.out.println("Professor: "+professor.getNome());
        System.out.println("Sala: "+sala);
        System.out.println("Máximo de alunos: "+Max_alunos);
        System.out.println("====ALUNOS MATRICULADOS====");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Aluno: " + alunos[i].getNome());
            }

        }
        System.out.println("====FIM IMPRESSÃO====\n");
    }

    void alterarAluno(String nomeAntigo, String novoNome) {
        int flag = 0;
        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] == null) {
                break;
            } else {
                if (alunos[i].getNome().equals(nomeAntigo)) {
                    alunos[i].setNome(novoNome);
                    flag = 1;
                    break;
                }
            }

        }

        if (flag == 1) {
            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }

    }

    void excluirAluno(String nome) {
        int flag = 0;
        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] == null) {
                break;
            } else {
                if (alunos[i].getNome().equals(nome)) {
                    alunos[i]=null;
                    flag = 1;
                    break;
                }
            }

        }

        if (flag == 1) {
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
    
    void qtdAlunosTurma(){
        System.out.println("Alunos na turma: "+qtdAlunos);
    }




    
    

}
