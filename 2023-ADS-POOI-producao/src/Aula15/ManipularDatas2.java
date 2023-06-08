/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Davi
 */
public class ManipularDatas2 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date dataEntrada = sdf1.parse("01/06/2023 08:00:00");
        Date dataSaida = sdf1.parse("05/06/2023 08:00:00");

        if (dataEntrada.equals(dataSaida)) {
            System.out.println("Entrada igual a saída!");
        } else {
            System.out.println("Entrada diferente de saída!");
        }

        if (dataSaida.after(dataEntrada)) {
            System.out.println("Saída posterior a entrada!");
        } else {
            System.out.println("Saída não é posterior a entrada!");
        }

        if (dataEntrada.before(dataSaida)) {
            System.out.println("Data entrada anterior a data de saída!");
        } else {
            System.out.println("Data entrada não é anterior a data de saída!");
        }

        System.out.println("===============");

        long horas = dataSaida.getTime() - dataEntrada.getTime();
        long horas2 = TimeUnit.HOURS.convert(horas, TimeUnit.MILLISECONDS);

        System.out.println("Diferença em horas (Saída - Entrada): " + horas2);

        long dias = dataSaida.getTime() - dataEntrada.getTime();
        long dias2 = TimeUnit.DAYS.convert(horas, TimeUnit.MILLISECONDS);

        System.out.println("Diferença em dias (Saída - Entrada): " + dias2);
    }

}
