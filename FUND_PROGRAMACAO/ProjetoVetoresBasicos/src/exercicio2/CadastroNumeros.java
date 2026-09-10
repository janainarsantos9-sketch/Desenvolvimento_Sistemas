package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite a " + (i + 1) + "ª posicao numeros:");
			numeros[i] = input.nextInt();
		}
		
		System.out.println("numeros cadastrados :");
		for (int numero : numeros) {
			System.out.println(numero);
		}

		input.close();

	}

}
