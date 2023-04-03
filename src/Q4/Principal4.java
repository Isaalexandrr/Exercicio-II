package Q4;

import java.util.Scanner;

public class Principal4 {
 public static void main (String[] args) {
	 
	 int salario, opcao;
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("****PLANO DE TRABALHO****");
	 System.out.println("Digite seu sálario: ");
	 salario = sc.nextInt();
	 System.out.println("Escolha seu plano de trabalho");
	 System.out.println("1. A: 10%");
	 System.out.println("2. B: 15%");
	 System.out.println("3. C: 20%");
	 opcao = sc.nextInt();
	 
	 if (opcao==1) { 
		 System.out.println("Seu novo salário é " + ((salario*0.1)+salario));
	 } else if (opcao==2) {
		 System.out.println("Seu novo salário é " + ((salario*0.15)+salario));
	 } else if (opcao==3) {
		 System.out.println("Seu novo salário é " + ((salario*0.2)+salario));
	 }
	 
 }
}
