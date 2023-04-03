package Q8;

import java.util.Scanner;

public class Principal8 {
	public static void main (String[] args) {
		
		int desconto, veiculo, opcao;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("****CONCESSIONÁRIA CARANGO****");
		System.out.println();
		System.out.println("Qual valor do veiculo? ");
		veiculo = sc.nextInt();
		System.out.println("Escolha a opção");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Disel");
	    opcao = sc.nextInt();
	    
	    if (opcao==1){
	    	desconto = (int) (veiculo*0.25);
	    	System.out.println("O valor do desconto é "+ desconto);
	    	System.out.println("O valor do veiculo com o desconto é " + (veiculo-desconto));	
	    } else if (opcao==2) {
	    	desconto = (int) (veiculo*0.21);
	    	System.out.println("O valor do desconto é "+ desconto);
	    	System.out.println("O valor do veiculo com o desconto é " + (veiculo-desconto));	
	    } else if (opcao==3) {
	    	desconto = (int) (veiculo*0.14);
	    	System.out.println("O valor do desconto é "+ desconto);
	    	System.out.println("O valor do veiculo com o desconto é " + (veiculo-desconto));	
	    }
		
		
		
		
		
		
		
		
		
		
		
	}

}
