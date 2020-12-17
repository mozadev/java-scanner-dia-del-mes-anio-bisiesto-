/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasdelmes;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Diasdelmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int mm, aa, dias = 0;
        // mm es el mes ingresado (1,2,..12))
        System.out.println("Ingrese el mes ");
        mm = leer.nextInt();
        // aa es el año ingresado (2004 por ejemplo)
        System.out.println("Ingrese el año ");
        aa = leer.nextInt();
        // determinar el número de dias x mes
        switch (mm) {
            case 1:// enero
            case 3:// marzo
            case 5:// mayo
            case 7:// julio
            case 8:// agosto
            case 10:// octubre
            case 12:// diciembre
                dias = 31;
                break;
            case 4:// abril
            case 6:// junio
            case 9:// septiembre
            case 11:// noviembre
                dias = 30;
            case 2:// febrero
                // determinar si el año es bisiesto
                if ((aa % 4 == 0)
                        && (aa % 100 != 0)
                        || (aa % 4 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("mes no valido");
                break;
        }
        if (mm >= 1 && mm <= 12) {
            System.out.println("El mes "
                    + mm + " del año " + aa
                    + " tiene " + dias + " dias");
        }

    }

}
