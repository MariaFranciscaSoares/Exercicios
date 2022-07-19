package application;
/*
 *  Dado um vetor que guarda o valor de faturamento di�rio de uma distribuidora, 
 *  fa�a um programa, na linguagem que desejar, que calcule e retorne:
� O menor valor de faturamento ocorrido em um dia do m�s;
� O maior valor de faturamento ocorrido em um dia do m�s;
� N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		List<Double> dailyBilling = new ArrayList<>();

		int month = 30;
		int count = 0;

		// Armazenando valores na List.
		while (count <= month) {
			double value = random.nextInt(1000);
			dailyBilling.add(value);
			count++;
		}

		// Exibindo valores armazenados.
		for (Double value : dailyBilling) {
			System.out.println(value);
		}

		// Fun��o para encontrar maior faturamento di�rio.
		double larger = 0;

		for (Double value : dailyBilling) {
			if (value > larger)
				larger = value;
		}

		// Fun��o para encontrar menor faturamento di�rio.
		double smaller = dailyBilling.get(1);

		for (Double value : dailyBilling) {
			if (value < smaller)
				smaller = value;
		}

		// Fun��o para encontrar m�dia do faturamento mensal.
		double sum = 0;

		for (Double value : dailyBilling) {
			sum += value;
		}
		double average = sum / month;

		// Fun��o para contar quantos dias o faturamento di�rio foi maior que o
		// faturamento mensal.
		int countDays = 0;
		for (Double value : dailyBilling) {
			if (value > average)
				countDays++;
		}

		System.out.println();
		System.out.println("Menor valor de faturamento ocorrido no m�s: " + smaller);
		System.out.println("Maior valor de faturamento ocorrido no m�s: " + larger);
		System.out.println("Valor da m�dia de faturamento ocorrido no m�s: " + String.format("%.2f", average));
		System.out.println(
				"N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal: " + countDays);

		sc.close();
	}

}
