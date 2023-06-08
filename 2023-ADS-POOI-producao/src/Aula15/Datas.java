/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Davi
 */
public class Datas {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data1;
        
        data1 = sdf1.parse("01/06/2023 15:20:02");
        
        
        System.out.println("Data: "+sdf1.format(data1));
        
    }
    
}
