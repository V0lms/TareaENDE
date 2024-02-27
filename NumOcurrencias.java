package gitup;
import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = scr.nextLine();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (Character.isLetter(palabra.charAt(i))) {
                contador++;
            }
        }
        System.out.println("El número de letras es: " + contador);
        scr.close();
    }
}

