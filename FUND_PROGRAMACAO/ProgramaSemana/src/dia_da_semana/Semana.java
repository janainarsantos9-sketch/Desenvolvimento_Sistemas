package dia_da_semana;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda_feira");
			break;
		case 3:
		System.out.println("Terca_feira");
		break;
		case 4:
		System.out.println("Quarta_feira");
		break;
		case 5:
		System.out.println("Quinta_feira");
		break;
		case 6:
			System.out.println("Sexta_feira");
			break;
		case 7:
		System.out.println("Sabado");
		
		default:
			System.out.println("Opcão inválida");
		}

	}

}
