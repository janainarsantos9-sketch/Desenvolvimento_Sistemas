package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] notas = new double[4];
		double soma = 0;
		double maior;
		double menor;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "ª notas: ");
			notas[i] = input.nextDouble();

			soma += notas[i];

		}

		maior = notas[0];
		menor = notas[0];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posicao" + i + ":" + notas[i]);
			if (notas[i] > maior) {
				maior = notas[i];
			}
			
			if(notas[i] < menor) {
				menor = notas[i];
			}
		}
		
		double media = soma/ notas.length;
		
		System.out.printf("\nMedia: %.2f%n",media);
		System.out.println("Maior nota:"+ maior);
		System.out.println("Menor nota:" + menor);
		
		input.close();

	}

}
