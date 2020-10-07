package com.company;

import java.util.Scanner;

public class Fonction_Menu {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        String choixMenuPrincipal;

        System.out.println("Bienvenue sur notre jeu intéractif. Tapez le chiffre correspondant en fonction de ce que vous voulez faire :");
        System.out.println(); // Sauter une ligne
        System.out.println("    -1 Jouer"); // Tape 1 si il veut lancer une partie
        System.out.println("    -2 Voir les règles"); // Tape 2 si il veut voir les règles
        System.out.println("    -0 Quitter le jeu"); // Tape 0 si il veut quitter le jeu

        choixMenuPrincipal = scanner.nextLine(); // Choix de l'utilisateur
    }

}
