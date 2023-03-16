/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author Davi
 */
public class Carro {
    
    String marca,modelo,placa,cor;
    int ano;
    double preco;

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", ano=" + ano + ", preco=" + preco + '}';
    }
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        c1.marca="VW";
        c1.modelo="Gol";
        c1.placa="NKU-9090";
        c1.cor="Branco";
        c1.ano=2015;
        c1.preco=16.700;
        
        System.out.println(c1);
    }
    
    
}
