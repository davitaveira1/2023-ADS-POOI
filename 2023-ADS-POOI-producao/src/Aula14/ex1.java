/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author Davi
 */
public class ex1 {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date data1 = sdf1.parse("10/06/2023");
        Date data2 = sdf2.parse("02/06/2023 10:30:42");
        
        System.out.println(data1);
        System.out.println(data2);
        System.out.println("================");
        System.out.println(sdf1.format(data1));
        System.out.println(sdf2.format(data2));
        System.out.println("================");
        Date data3 = new Date();
        System.out.println(sdf2.format(data3));
        
        
    }
    
}
