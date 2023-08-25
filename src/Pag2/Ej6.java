package Pag2;

/*
Desitjem enviar una carta formal als nostres clients, i volem generar de forma automàtica l'encapçalament per a cada client.
A la nostra base de dades de client tenim els camps: tractament, nom, cognom1 i cognom2.
Fes un programa que generi aquest encapçalament amb el format que s'observa a Sample Output

Input Format

L'entrada consta de 4 línies:
tractament
nom
cognom1
cognom2

Constraints
-

Output Format
-

Sample Input 0
Senyor
Antoni
Perez
Sales

Sample Output 0
Senyor Perez Sales, Antoni
El principal objectiu de la present carta...

Sample Input 1
Excelentissima senyora
Maria Antonia
de la Fuente
Rodriguez

Sample Output 1
Excelentissima senyora de la Fuente Rodriguez, Maria Antonia
El principal objectiu de la present carta...

Sample Input 2
Sra.
Juana
Garcia
Romero

Sample Output 2
Sra. Garcia Romero, Juana
El principal objectiu de la present carta...
*/

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tractament = scanner.nextLine();
        String nom = scanner.nextLine();
        String cognom1 = scanner.nextLine();
        String cognom2 = scanner.nextLine();

        System.out.println(tractament + " " + cognom1 + " " + cognom2 + ", " + nom);
        System.out.println();
        System.out.println("El principal objectiu de la present carta...");
    }
}
