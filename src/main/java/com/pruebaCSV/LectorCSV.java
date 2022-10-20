package com.pruebaCSV;

/*
esta clase se encarga de leer el archivo .csv que se le pase como parametro

No devuelve nada , si no que muestra el contenido del csv por el terminal
 */

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LectorCSV {
    public void leeCSV(String nombreArchivo){
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;
            while((fila = csvReader.readNext()) !=null){
                System.out.println(fila[0]+"|"
                +fila[1]+"|"
                +fila[2]+"|");
            }

            csvReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
