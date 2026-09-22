package Capitais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de janeiro", "Rio de Janeiro");
		capitais.put("Sao Paulo","São Paulo");
		capitais.put("Minas Gerais","Belo Horizonte");
		
		for(Map.Entry<String,String>capital:capitais.entrySet()) {
			System.out.println("Estado: "+ capital.getKey()+ " | Capital: "+capital.getValue());
		}
		
      System.out.println("Digite o estado:");
      String estado=input.nextLine();
      
      if(capitais.containsKey(estado)) {
    	  String capital=capitais.get(estado);
    	  System.out.println("capital encontrada: "+ capital);
      
      }else {
    	  System.out.println("Estado não encontrado");
      }
	}

}
