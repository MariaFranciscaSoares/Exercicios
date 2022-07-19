package application;
/*
 *  Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, 
 *  faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
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

		// Função para encontrar maior faturamento diário.
		double larger = 0;

		for (Double value : dailyBilling) {
			if (value > larger)
				larger = value;
		}

		// Função para encontrar menor faturamento diário.
		double smaller = dailyBilling.get(1);

		for (Double value : dailyBilling) {
			if (value < smaller)
				smaller = value;
		}

		// Função para encontrar média do faturamento mensal.
		double sum = 0;

		for (Double value : dailyBilling) {
			sum += value;
		}
		double average = sum / month;

		// Função para contar quantos dias o faturamento diário foi maior que o
		// faturamento mensal.
		int countDays = 0;
		for (Double value : dailyBilling) {
			if (value > average)
				countDays++;
		}

		System.out.println();
		System.out.println("Menor valor de faturamento ocorrido no mês: " + smaller);
		System.out.println("Maior valor de faturamento ocorrido no mês: " + larger);
		System.out.println("Valor da média de faturamento ocorrido no mês: " + String.format("%.2f", average));
		System.out.println(
				"Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + countDays);

		sc.close();
	}

}
