package com.senati.eti;

import java.util.Scanner;

public class Caso8de3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número....: ");
		int n = sc.nextInt();
		
		System.out.println("Table de Multiplicar del " + n);
		
		for(int i =1; i <= 15; i ++)
			System.out.println(n + " x " + i + " = " + ( n * i));
		
	}

}
