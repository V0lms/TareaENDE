package gitup;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Introduce 10 números:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			numeros[i] = scr.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (numeros[j] > numeros[j + 1]) {
					numeros[j] = numeros[j] + numeros[j + 1];
					numeros[j + 1] = numeros[j] - numeros[j + 1];
					numeros[j] = numeros[j] - numeros[j + 1];
				}
			}
		}
		System.out.println(" Numeros ordenados de menor a mayor: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
	}
}
