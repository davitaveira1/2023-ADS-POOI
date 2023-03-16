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
    
    void ValorTabelaFipe(){        
        double ValorTabelaFipe=preco*0.8;        
        System.out.println("Valor tabela FIPE: "+ValorTabelaFipe);
        
    }
    
    void corDoCarro(){
        System.out.println("Cor: "+cor);
    }
    
    

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
        c1.preco=100000;
        
        System.out.println(c1);
        
        c1.ValorTabelaFipe();
    }
    
    
}
