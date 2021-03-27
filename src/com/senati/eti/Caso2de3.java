package com.senati.eti;

import java.util.Scanner;

public class Caso2de3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un  número......:");
		int n = sc.nextInt();
		
		int sumatoria = 0; // Acumulador
		int i = 1;
		
		while (i <= n) {
			sumatoria +=i;
			
			if (i != n) 
				System.out.print(i + " + ");
			else
				System.out.print(i + " = " +  sumatoria);
			i++;
		}
	}

}
