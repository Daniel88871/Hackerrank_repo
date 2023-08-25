package Pag2;

import java.util.Scanner;

/*
Donat el nom d'una persona, fes-li una salutació

Input Format
Un string amb el nom d'una persona

Constraints
-

Output Format
La paraula "Hola" seguida d'un espai en blanc, el nom de la persona, i una exclamació "!"

Sample Input 0
Joan

Sample Output 0
Hola Joan!

Sample Input 1
Anna

Sample Output 1
Hola Anna!

Sample Input 2
Josep Antoni

Sample Output 2
Hola Josep Antoni!

Sample Input 3
Maria Elena

Sample Output 3
Hola Maria Elena!
 */

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + "!");
    }
}