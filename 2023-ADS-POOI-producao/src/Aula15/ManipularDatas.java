/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Davi
 */
public class ManipularDatas {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data1 = sdf1.parse("02/06/2023 12:30:12");

        System.out.println("Data: " + sdf1.format(data1));

        Calendar cal = Calendar.getInstance();
        cal.setTime(data1);

        //adicionando horas na data
        cal.add(Calendar.HOUR_OF_DAY, 10);
        cal.add(Calendar.MINUTE, 13);
        cal.add(Calendar.DAY_OF_MONTH, 10);
        data1 = cal.getTime();

        System.out.println("Data: " + sdf1.format(data1));
        System.out.println("=============");
        //recuperando um parâmetro da data
        int horas = cal.get(Calendar.HOUR);
        int minuto = cal.get(Calendar.MINUTE);
        int segundos = cal.get(Calendar.SECOND);
        System.out.println("Horas da data: " + horas);
        System.out.println("Minutos da data: " + minuto);
        System.out.println("Segundos da data: " + segundos);
        System.out.println("==============");
        
        int mes = cal.get(Calendar.MONTH);
        System.out.println("Mês da data: "+(mes+1));

    }

}
