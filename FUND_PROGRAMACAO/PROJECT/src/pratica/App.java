package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
       int numero1 = leia.nextInt();
       
       System.out.println("Digite o segundo valor");
       int numero2 = leia.nextInt();

        System.out.println(numero1 + numero2);
        
        System.out.println("Digite a idade:");
        int idade = Integer.parseInt(leia.nextLine());
        
        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        
        System.out.println("Nome:"+ nome);
        System.out.println("Idade:"+ idade);
	}

}
