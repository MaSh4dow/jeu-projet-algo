package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Fonction_Menu.menu();
        Scanner scanner = new Scanner(System.in);
        String choixMenuPrincipal;
        choixMenuPrincipal = scanner.next();


        while (!(choixMenuPrincipal.equals("1") || choixMenuPrincipal.equals("2") || choixMenuPrincipal.equals("0"))){ // Si la saisie du choix est incorrecte
            System.out.println("Votre saisie est incorrecte. Tapez le chiffre correspondant en fonction de ce que vous voulez faire");
            System.out.println();
            System.out.println("    -1 Jouer");
            System.out.println("    -2 Voir les règles");
            System.out.println("    -0 Quitter le jeu");

            choixMenuPrincipal = scanner.nextLine();
        }

        if (choixMenuPrincipal.equals("1")) {
            //Implémenter la fonction pour jouer
            System.out.println("Les règles sont simples ! ");
        }
        else if (choixMenuPrincipal.equals("2")){
            //Implémenter la fonction pour afficher les règles
            Fonction.regles();
        }
        else if (choixMenuPrincipal.equals("0")){
            System.out.println("Quitter le jeu");
            return;
        }
    }
}