package application;

import java.util.Locale;

/* Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de 
representação que cada estado teve dentro do valor total mensal da distribuidora.
 */

public class Program03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Double sp = 67.83643, rj = 36.67866, mg = 29.22988, es = 27.16548, outros = 19.84953;

		double sum = sp + rj + mg + es + outros;

		System.out.println("Percentual de representação do estado de SP: " + String.format("%.2f",  percentual(sp, sum)) + "%");
		System.out.println("Percentual de representação do estado de RJ: " + String.format("%.2f",  percentual(rj, sum)) + "%");
		System.out.println("Percentual de representação do estado de MG: " + String.format("%.2f",  percentual(mg, sum)) + "%");
		System.out.println("Percentual de representação do estado de EP: " + String.format("%.2f",  percentual(es, sum)) + "%");

	}

	public static double percentual(double estado, double sum) {

		return (estado * 100 / sum);
	}

}
