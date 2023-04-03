package Q2;

import java.util.Scanner;

public class Principal2 {
     public static void main (String[] args) {
	 
    	 double numero1, numero2, opcao;
    	 Scanner sc = new Scanner (System.in);
    	 
    	 System.out.println("Informe um número: ");
    	 numero1 = sc.nextDouble();
    	 System.out.println("Informe outro número: ");
    	 numero2 = sc.nextDouble();
    	 System.out.println("Esolha a opção que deseja");
    	 System.out.println("1. M");
    	 System.out.println("2. S");
    	 System.out.println("3. P");
    	 System.out.println("4. D");
    	 opcao = sc.nextDouble();
    	 
    	 if (opcao==1) {
    		 System.out.println("A Media é " + (numero1+numero2)/2);
    	 } else if (opcao==2) {
    		 if (numero1>numero2)
    		 System.out.println("A Diferença é " + (numero1-numero2));
    		 else if (numero1<numero2)
    			 System.out.println("A Diferença é "+ (numero2-numero1));
    	 } else if (opcao==3) {
    		 System.out.println("O Produto é "+ (numero1*numero2));
    	 } else if (opcao==4) {
    		 System.out.println("O resultado da Divisão é "+ (numero1/numero2));
    	 } 
    	 
    	 
    	 
    	 
    	 
	 
 }
}
