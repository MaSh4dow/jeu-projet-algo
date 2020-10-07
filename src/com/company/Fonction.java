package com.company;

import java.util.Scanner;

public class Fonction {



    public static void regles() {

        Scanner scanner = new Scanner(System.in);
        String retourMenuPrincipal;



        System.out.println("Les règles sont simples : ");
        System.out.println("");
        System.out.println("Pendant son tour un joueur peut se déplacer son pion (verticalement ou horizontalement), puis il détruit une case du plateau.");
        System.out.println("");
        System.out.println("Le dernier joueur pouvant encore se déplacer gagne !");
        System.out.println("");
        System.out.println("Mais tout ca serait trop simple hahah ! Voici quelques contraintes : ");
        System.out.println("- Un joueur ne peut pas détruire une case occupées");
        System.out.println("- Un joueur ne peut pas occcuper une case détruite ou déja occupée");
        System.out.println("- Un joueur bloqué pendant un tour est déclaré perdant ");
        System.out.println("");
        System.out.println("Vous pouvez maintenant jouer !");

        System.out.println("Pour aller au menu principal tape 1");
        retourMenuPrincipal = scanner.next();


        if(retourMenuPrincipal.equals("1")) {
            Fonction_Menu.menu();

        }

    }
}
