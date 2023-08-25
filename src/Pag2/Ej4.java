package Pag2;

/*
Escriu un programa que llegeixi cinc paraules de l'entrada estàndard i imprimeixi cada paraula en una nova línia. Les paraules han d'estar en el mateix ordre.

Input Format
Cinc paraules, separades per espais en blanc o salts de línia.

Constraints
-

Output Format
Cada paraula en una nova línia

Sample Input 0
Java te
8 tipus primitius

Sample Output 0
Java
te
8
tipus
primitius

Sample Input 1
Java te 5
operadors
aritmetics

Sample Output 1
Java
te
5
operadors
aritmetics

Sample Input 2
gat gos
vaca
porc gall

Sample Output 2
gat
gos
vaca
porc
gall

Sample Input 3
a b c d e

Sample Output 3
a
b
c
d
e
 */

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase1 = scanner.next();
        String frase2 = scanner.next();
        String frase3 = scanner.next();
        String frase4 = scanner.next();
        String frase5 = scanner.next();

        System.out.println(frase1);
        System.out.println(frase2);
        System.out.println(frase3);
        System.out.println(frase4);
        System.out.println(frase5);
    }
}
