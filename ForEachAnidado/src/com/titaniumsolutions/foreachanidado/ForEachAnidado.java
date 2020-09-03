package com.titaniumsolutions.foreachanidado;

public class ForEachAnidado {

	public static void main(String[] args) {
		
		// Definimos un array de 3 filas x 5 columnas 
		int array[][]= {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		
		// Recorremos el array multidimencional 
		for (int[] arrayInterno : array) {
			for(int numero: arrayInterno) {
				System.out.println("numero: " + numero);
			}
		}
	}

}
