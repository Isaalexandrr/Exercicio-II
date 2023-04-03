package Q5;

import java.util.Scanner;

public class Principal5 {
	public static void main (String[] args) {
		
		int n1, n2, n3;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		System.out.println("Digite um número: ");
		n2 = sc.nextInt();
		System.out.println("Digite um numero: ");
		n3 = sc.nextInt();
		
		
		if ((n1<n2)&&(n2<n3)){
			System.out.println("Ordem crescente é "+ n1 + n2 + n3);	
		} else if ((n1<n3)&&(n3<n2)) {
			System.out.println("Ordem crescente é "+ n1 + n3 + n2);
		} else if ((n2<n1)&&(n1<n3)) {
			System.out.println("Ordem crescente é "+ n2 + n1 + n3);
		} else if ((n2<n3)&&(n3<n1)) {
			System.out.println("Ordem crescente é "+ n2 + n3 + n1);
		} else if ((n3<n1)&&(n1<n2)) {
			System.out.println("Ordem crescente é "+ n3 + n1 + n2);
		} else if ((n3<n2)&&(n2<n1)) {
			System.out.println("Ordem crescente é "+ n3 + n2 + n1);
		}
		
		
		
		
		
		
		
	}
   
}
