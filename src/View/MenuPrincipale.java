/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author FARID
 */
public class MenuPrincipale {
    // Méthode qui affiche un menu offrant 3 options et lit le choix de l’utilisateur au clavier
    // puis retourne ce choix
    public static int menu() {
        //Déclaration
        //Variables
        int choix;
        //Lecture au clavier
        Scanner scan = new Scanner(System.in);

        //Traitement
        //Affichage du menu
        //Inviter l'utilisateur à faire son choix de menu
        System.out.print("Veuillez selectionner votre article: ");
        System.out.println("\n1- Pomme\n2- Orange\n3- Afficher coût total\n4- Quitter");
        
        //Test de la validité du choix si c'est c'est un entier
        while (!scan.hasNextInt()) {
            System.out.println("Type d'entrée incorrect!!!\nVeuillez entrer votre choix de menu: ");
            scan.nextLine();
        }
        //Saisie du choix
        choix = scan.nextInt();
        scan.nextLine();
        //Test de l'existance du choix si c'est 1 2 ou 3
        while (choix < 1 || choix > 4) {
            //Affichage du message d'erreur lorsque le choix est inexistant
            System.out.println("Choix invalid!!!");
            //Affichage du menu de nouveau
            System.out.print("Veuillez selectionner votre article: ");
            System.out.println("\n1- Pomme\n2- Orange\n3- Afficher coût total\n4- Quitter");

            //Test de la validité du choix si c'est c'est un entier
            while (!scan.hasNextInt()) {
                System.out.println("Type d'entrée incorrect!!!\nVeuillez entrer votre choix de menu: ");
                scan.nextLine();
            }
            //Saisie du choix à nouveau
            choix = scan.nextInt();
            scan.nextLine();
        }
        return choix;
    }
}
