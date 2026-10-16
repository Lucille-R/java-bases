package com.ada.spedev.lucille.katas;

/*
 * KATA 01 - Les types primitifs
 * Notions : int, double, char, boolean, division entière, modulo (%), cast
 *
 * Consigne :
 *
 * 1) Conversion de temps
 *    On a une durée de 98765 secondes stockée dans un int.
 *    Afficher cette durée sous la forme : "1 jour(s) 3 heure(s) 26 minute(s) 5 seconde(s)"
 *    Indice : utiliser la division entière (/) et le modulo (%).
 *
 * 2) Conversion de température
 *    Convertir 37 degrés Celsius en Fahrenheit : F = C * 9 / 5 + 32
 *    - Faites le calcul avec des int, puis avec des double. Que remarquez-vous ?
 *    - Que donne 9 / 5 ? Et 9.0 / 5 ? Pourquoi ?
 *
 * 3) Les casts
 *    - Stocker 7.99 dans un double, puis le convertir en int. Quel résultat ?
 *    - Afficher le caractère 'A', puis (int) 'A', puis (char) ('A' + 2)
 *
 * 4) Les booléens
 *    - Déclarer un int age. Créer un boolean estMajeur qui vaut true si age >= 18.
 *    - Créer un boolean peutVoter = estMajeur && aLaNationalite
 */


public class Kata01_Types {
    public static void main(String[] args) {
        /* 1) Conversion de temps
         *    On a une durée de 98765 secondes stockée dans un int.
         *    Afficher cette durée sous la forme : "1 jour(s) 3 heure(s) 26 minute(s) 5 seconde(s)"
         *    Indice : utiliser la division entière (/) et le modulo (%).
         */
        int totalSeconds = 98765;
        int days = totalSeconds / 86400; // 86400s par jour (type 'int' donc le reste est tronqué) ; jour = 1
        int rest = totalSeconds % 86400; // Donc reste = 98765 % 86400 = 12365s
        int hours = rest / 3600; // 3600s par heure ; heure = 3
        rest = rest % 3600; // Donc reste = 12365 % 3600 = 1565s
        int minutes = rest / 60; // minutes = 26
        int seconds = rest % 60; // Donc 1565 % 60 = 5s

        System.out.println(days + " day(s) " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");


        /*  2) Conversion de température
         *    Convertir 37 degrés Celsius en Fahrenheit : F = C * 9 / 5 + 32
         *    - Faites le calcul avec des int, puis avec des double. Que remarquez-vous ?
         *    - Que donne 9 / 5 ? Et 9.0 / 5 ? Pourquoi ?
         */
        int intCelsius = 37;
        int intFahrenheit = intCelsius * 9 / 5 + 32;
        System.out.println("Conversion 'int' : " + intFahrenheit);
        // Affiche 98 au lieu de 98.6 : 37 * 9 = 333, puis 333 / 5 est une division entière (int / int)
        // qui coupe la partie décimale (66.6 devient 66), puis 66 + 32 = 98.
        // La décimale est perdue au milieu du calcul, pas à l'affichage.

        double doubleCelsius = 37;
        double doubleFahrenheit = doubleCelsius * 9 / 5 + 32;
        System.out.println("Conversion 'double' : " + doubleFahrenheit);
        // Affiche 98.6 : comme doubleCelsius est un double, toutes les opérations sont décimales.

        System.out.println("9 / 5 = " + (9 / 5));
        // Affiche 1 : int / int donne une division entière, 1.8 est coupé (pas arrondi) en 1.
        System.out.println("9.0 / 5 = " + (9.0 / 5));
        // Affiche 1.8 : 9.0 est un double, donc 5 est converti en double avant la division.
        // => le type du résultat dépend du type des opérandes, pas de la variable qui le reçoit.

        /*  3) Les casts
         *    - Stocker 7.99 dans un double, puis le convertir en int. Quel résultat ?
         *    - Afficher le caractère 'A', puis (int) 'A', puis (char) ('A' + 2)
         */
        double number = 7.99;
        int convertedNumber = (int) number;
        System.out.println("Double converted to int : " + convertedNumber);
        // Affiche '7' car 'int' coupe les décimales (pas d'arrondi)

        char letter = 'A';
        System.out.println("letter : " + letter);
        // Affiche 'A'
        int intLetter = (int) letter;
        System.out.println("(int) letter : " + intLetter);
        // Affiche '65' (Unicode de la lettre A)
        char charLetter2 = (char) (letter + 2);
        System.out.println("(char) (letter + 2) : " + charLetter2);
        // Affiche 'C'
        // Le système part de l'Unicode de A (65), lui ajoute 2 (67) et indique la lettre correspondante


        /* 4) Les booléens
         *    - Déclarer un int age. Créer un boolean estMajeur qui vaut true si age >= 18.
         *    - Créer un boolean peutVoter = estMajeur && aLaNationalite
         */
        int age = 10;
        boolean estMajeur = age >= 18;
        boolean aLaNationalite = true;
        boolean peutVoter = estMajeur && aLaNationalite;
        if (estMajeur) {
            System.out.println("Age = " + age + " : vous êtes majeur");
        } else {
            System.out.println("Age = " + age + " : vous êtes mineur !");
        }
        if (peutVoter) {
            System.out.println("Vous pouvez voter !");
        } else {
            System.out.println("Vous ne pouvez pas voter...");
        }

    }
}