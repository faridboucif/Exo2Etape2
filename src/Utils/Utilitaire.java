/*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
 */
package Utils;

import Modele.Fruit;
import Modele.ListeFruit;

/**
 *
 * @author FARID
 */
public class Utilitaire {

    public static double calculCoutTotal(ListeFruit maListe) {
        double total = 0;

        for (Fruit fruit : maListe) {
            total += fruit.getPrixFruit();
        }
        return total;
    }

    public static double calculCoutTotalAvecPromotion(ListeFruit maListe) {
        double total=0;
        int nombrePomme = 0;
        int nombreOrange = 0;

        for (Fruit fruit : maListe) {
            if (fruit.getNomFruit().equals("pomme")) {
                nombrePomme++;
                if (nombrePomme % 2 != 0) {
                    total+=fruit.getPrixFruit();
                }
            } else {
                nombreOrange++;
                if (nombreOrange % 3 != 0) {
                    total+=fruit.getPrixFruit();
                }
            }
        }
        return total;
    }

}
