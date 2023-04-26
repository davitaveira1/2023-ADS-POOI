/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06;

/**
 *
 * @author Davi
 */
public class Ex03 {
    
    public static void main(String[] args) {
        String[] nome = new String[3];
        
        nome[0] = "Davi";
        nome[1] = "Daniel";
        nome[2] = "Rafael";
        /*
        int pos;
        for(String x : nome){
            pos = x.indexOf(x);
            System.out.println("Pos: "+pos);        
        }
*/
        
        int[] a = {4,5,6,7};
        String[] b = {"davi","daniel","lucas"};
        String[] c;
        c = new String[5];
        
        for(int i=0;i < a.length;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
