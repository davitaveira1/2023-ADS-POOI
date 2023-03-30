/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Davi
 */
public class ex02_horario {
    
    int hora,minuto,segundo;

    ex02_horario(int horaClasse,int minutoClasse,int segundoClasse) {
        hora = horaClasse;
        minuto = minutoClasse;
        segundo = segundoClasse;                
    }
    
    void formatoHora(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
    
    void horaEmSegundos(){
        int resultado = hora*3600;
        System.out.println("Hora em segundos: "+resultado);
    }
    
    int returnoHoraEmSegundos(){
        return hora*3600;
    }
    
    public static void main(String[] args) {
        ex02_horario h = new ex02_horario(3, 50, 15);
        h.formatoHora();
        h.horaEmSegundos();
        
        System.out.println("Método com return: "+h.returnoHoraEmSegundos());
        
    }
    
    
    
}
