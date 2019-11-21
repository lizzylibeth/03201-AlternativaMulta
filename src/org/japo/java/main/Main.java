/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //CONSTANTES
        final double IMPORTE_MULTA = 60.0;
        final int TIPO_DESCUENTO = 20;
        final int DIAS_DESCUENTO = 30;

        //VARIABLES
        int diasDemora;
        boolean testOk;

        double importeDecto = 0.0;
        double importeFinal;

        //CABECERA
        System.out.println("Alternativa de Multa ");
        System.out.println("====================");

        try {
            //INTRODUCIR LOS DIAS DE DEMORA
            System.out.print("Días de demora ...........: ");
            diasDemora = SCN.nextInt();

            //SEPARADOR
            System.out.println("---");

            //IMPORTE INICIAL MULTA
            System.out.printf(Locale.ENGLISH, "Importe inicial multa ....: %.2f € %n",
                    IMPORTE_MULTA);

            //SEPARADOR
            System.out.println("---");

            //PLAZO CON DESCUENTO
            System.out.printf("Plazo con descuento ......: %d días %n",
                    DIAS_DESCUENTO);

            //TANTO DESCUENTO
            System.out.printf("Tanto descuento ..........: %d %% %n",
                    TIPO_DESCUENTO);

            //COMPARACIÓN
            testOk = diasDemora <= DIAS_DESCUENTO;

            //CALCULA EL DESCUENTO
            if (testOk == true) {

                //IMPORTE DESCUENTO SI SE HA PASADO DE DÍAS
                importeDecto = IMPORTE_MULTA * TIPO_DESCUENTO / 100;
                System.out.printf(Locale.ENGLISH, "Importe descuento ........: %.2f €%n",
                        importeDecto);

                //SEPARADOR
                System.out.println("---");

                //CALCULAR IMPORTE FINAL
                importeFinal = IMPORTE_MULTA - importeDecto;

                //MUESTRA EL IMPORTE DE LA MULTA
                System.out.printf(Locale.ENGLISH, "Importe final multa ......: %.2f € %n",
                        importeFinal);

            } else {

                //IMPORTE DESCUENTO SI NO SE HA PASADO DE DÍAS
                importeDecto = 0.00;
                System.out.printf(Locale.ENGLISH, "Importe descuento ........: %.2f €%n",
                        importeDecto);

                //SEPARADOR
                System.out.println("---");

                //CALCULAR IMPORTE FINAL
                importeFinal = IMPORTE_MULTA - importeDecto;

                //MUESTRA EL IMPORTE DE LA MULTA
                System.out.printf(Locale.ENGLISH, "Importe final multa ......: %.2f € %n",
                        importeFinal);
            }

        } catch (Exception e) {
            System.out.println("---");
            System.out.println("ERROR: Entrada incorrecta");

        } finally {

            SCN.nextLine(); //Borrar buffer     
        }

    }//main

}//class
