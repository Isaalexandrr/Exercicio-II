package Q7;

import java.util.Scanner;

public class Principal7 {
     public static void main (String[] args) {
	  
     double num;
     Scanner sc = new Scanner (System.in);
     
     System.out.println("Digite um número qualquer: ");
     num = sc.nextDouble();
     
     if (num<0) {
    	 System.out.println("Negativo");
     } else if (num>0){
    	 System.out.println("Positivo");
     }  else {
    	 System.out.println("Igual a zero");
     }
 }
}
