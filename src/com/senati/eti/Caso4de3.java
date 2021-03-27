package com.senati.eti;

import java.util.Scanner;


public class Caso4de3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Leer Texto
		//Leer Número ( int = Enterotero o  float = Real)
		
		//Reiniciar las parte de lectura, o sino dara error
		
		//sc.nextLine();para reiniciar

		//Leer Texto
		//Se necesita un reinicio
		
		int n = 0, i = 1, num_mayor = 0;
		
		while(i <= 4) {
			System.out.print("Ingrese número :");
			n  = sc.nextInt();
			//Reinicia de la lectura
			
			
			
			if ( n > num_mayor) num_mayor = n;
			i++;
		}
		System.out.println("----------------");
		System.out.println("Número mayor es :" + num_mayor);
		
		

	}

}
