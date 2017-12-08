package control;

import Modele.ListeFruit;
import Modele.Orange;
import Modele.Pomme;
import Utils.Utilitaire;
import View.MenuPrincipale;
import java.util.Scanner;

/**
 *
 * @author FARID
 */
public class AppCtr {

    public static void main(String[] args) {
        //Déclarations
        //Variables
        int choixMenu = MenuPrincipale.menu();
        ListeFruit maListeFruit= new ListeFruit();
        //Traitement
        while (choixMenu != 4) {
            switch (choixMenu) {
                //Cas du choix numero 1 (Scanner une pomme)
                case 1: {
                    maListeFruit.add(new Pomme());
                }
                break;
                //Cas du choix numero 2 (Scanner une orange)
                case 2: {
                    maListeFruit.add(new Orange());
                }
                break;
                //Cas du choix numero 2 (Calcul du coût total)
                case 3: {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("Le tatal des fruits est : "+String.format("%.2f", Utilitaire.calculCoutTotalAvecPromotion(maListeFruit))+"$");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");                    
                }
                break;
                        
            }
            choixMenu = MenuPrincipale.menu();
        }
        System.out.println("Vous avez bien quitter le programme.");
    }
    
}
