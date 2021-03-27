package com.senati.eti;

import java.util.Scanner;

public class Caso6de3 {

	public static void main(String[] args) {
		Scanner registro = new Scanner(System.in);
		int  votantes = 0, participantes = 0; 
		
		String deseo = "S";
	
		while (deseo == "S"){
			int i = 1; 
			System.out.println("============================");
			System.out.println("Registro de datos " + i + ":");
			System.out.println("============================");
			
			System.out.println("Ingrese su nombre: ");
			String nombre = registro.nextLine();
			
			System.out.println("Ingrese su edad: ");
			int edad = registro.nextInt();
			
			String estado = "Menor de edad";
			
			if (edad >= 18) {
				estado = "Apto para votar";
				votantes++;
			}
			System.out.println("Estado del participante: " + estado );
			registro.nextLine();
			System.out.println("\n¿Desea registrar otro participante? <S/N>");
			deseo = registro.nextLine();
			participantes++;
			i++; 	
		}
		
		
		
		
		
		System.out.println("R E S U M E N");
		System.out.println("=============");
		System.out.println("Participantes registrados: " + participantes);
		System.out.println("Cantidad de participantes aptos para votar: "+ votantes);

	}

}
