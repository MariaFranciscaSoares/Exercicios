package application;

import java.util.Scanner;

/* Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor sempre ser� a 
 * soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...). Informado um n�mero, 
 * o programa calcula a sequ�ncia de Fibonacci e retorne uma mensagem 
 * avisando se o n�mero informado pertence ou n�o a sequ�ncia.
 */

public class Program01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0, y = 1, z = 0;

		System.out.println("Digite um n�mero inteiro: ");
		int num = sc.nextInt();

		while (z < num) {
			z = x + y;
			x = y;
			y = z;
			System.out.printf(z + ", ");
		}

		System.out.println();

		if (num == z)
			System.out.println("O n�mero informado pertence a sequ�ncia de Fibonacci.");
		else
			System.out.println("O n�mero informado n�o pertence a sequ�ncia de Fibonacci.");

		sc.close();

	}

}
