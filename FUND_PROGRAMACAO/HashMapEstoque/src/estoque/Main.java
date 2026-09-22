package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	HashMap<String,Integer> estoque= new HashMap<>();
	
	estoque.put("Teclado",10 );
	estoque.put("Mouse",15);
	estoque.put("Monitor",6 );
	estoque.put("Notebook",4);
	
	
	
	
System.out.print("Digite o estoque que deseja remover");
int estoque = input.nextInt();

if(estoques.containsKey(estoque)) {
	String nomeRemovido = estoques.remove(estoque);
	System.out.println("estoque removido:"+ itemremovido);
	
}
	}

}
