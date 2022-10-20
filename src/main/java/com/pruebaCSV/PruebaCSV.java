package com.pruebaCSV;

public class PruebaCSV {

        /*
         *@author Marcos Garzon Ahijon
         */

        public static void main(String[] args) {
            LectorCSV miLector = new LectorCSV();

            miLector.leeCSV("./src/main/resources/datos/pokemon.csv");


        }

}
