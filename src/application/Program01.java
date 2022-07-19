package application;

import java.util.Scanner;

/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
 * soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...). Informado um número, 
 * o programa calcula a sequência de Fibonacci e retorne uma mensagem 
 * avisando se o número informado pertence ou não a sequência.
 */

public class Program01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0, y = 1, z = 0;

		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();

		while (z < num) {
			z = x + y;
			x = y;
			y = z;
			System.out.printf(z + ", ");
		}

		System.out.println();

		if (num == z)
			System.out.println("O número informado pertence a sequência de Fibonacci.");
		else
			System.out.println("O número informado não pertence a sequência de Fibonacci.");

		sc.close();

	}

}
