package aula02;

import java.util.HashMap;

import java.util.Scanner;

public class ExemploHashMap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap<Integer, String> alunos = new HashMap<>();

		alunos.put(101, "Ana");
		alunos.put(102, "Bruno");
		alunos.put(103, "Carlos");

		System.out.print("Digite a matriculo:");
		int matricula = input.nextInt();

		if (alunos.containsKey(matricula)) {
			String nome = alunos.get(matricula);
			System.out.println("Aluno encontrado:" + nome);
		} else {
			System.out.println("Matricula não  encontrada.");
		}
		input.close();

	}

}
