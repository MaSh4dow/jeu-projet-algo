package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choixMenuPrincipal;

        System.out.println("Bienvenue sur notre jeu intéractif. Tapez le chiffre correspondant en fonction de ce que vous voulez faire :");
        System.out.println(); // Sauter une ligne
        System.out.println("    -1 Jouer"); // Tape 1 si il veut lancer une partie
        System.out.println("    -2 Voir les règles"); // Tape 2 si il veut voir les règles
        System.out.println("    -0 Quitter le jeu"); // Tape 0 si il veut quitter le jeu

        choixMenuPrincipal = scanner.nextLine(); // Choix de l'utilisateur

        while (!(choixMenuPrincipal.equals(1)) && !(choixMenuPrincipal.equals(2)) && !(choixMenuPrincipal.equals(0))){ // Si la saisie du choix est incorrecte
            System.out.println("Votre saisie est incorrecte. Tapez le chiffre correspondant en fonction de ce que vous voulez faire");
            System.out.println();
            System.out.println("    -1 Jouer");
            System.out.println("    -2 Voir les règles");
            System.out.println("    -0 Quitter le jeu");

            choixMenuPrincipal = scanner.nextLine();
        }

        if (choixMenuPrincipal.equals(1)) {
            //Implémenter la fonction pour jouer
            System.out.println("Implémenter la fonction pour jouer");
        }
        else if (choixMenuPrincipal.equals(2)){
            //Implémenter la fonction pour afficher les règles
            System.out.println("Implémenter la fonction pour afficher les règles");
        }
        else if (choixMenuPrincipal.equals(0)){
            System.out.println("Quitter le jeu");
            return;
        }
    }
}
