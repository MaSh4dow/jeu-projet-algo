package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // création du menu
        Scanner scanner = new Scanner (System.in);
        String menuJeu = new String();
        String menuRègle = new String();
        String menuQuitterLeJeu = new String();
        System.out.println("1- Pour jouer écris : Jouer");
        menuJeu = scanner.next();
        System.out.println("2- Pour lire les règles écris : règles");
        menuRègle = scanner.next();


    }
}
