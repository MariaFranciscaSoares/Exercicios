package application;
/*
 * Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada atrav�s de qualquer entrada de sua prefer�ncia ou pode ser previamente definida no c�digo;
b) Evite usar fun��es prontas, como, por exemplo, reverse;
 */

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {
			char letra = frase.charAt(i);
			System.out.print(letra);
		}

		sc.close();

	}

}
