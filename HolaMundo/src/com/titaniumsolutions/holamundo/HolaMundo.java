package com.titaniumsolutions.holamundo;
//Upper Camel Case, el nombre de la clase
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo IDE :)");
		
		//Enteros
		byte edad = 2;
		short year = 2020;
		int id_User = 1001;
		long id_twitter = 12345672345676L;
		
		//Punto Flotante
		float diametro = 34.25F;
		double precio = 12312.13412412312312;
		
		//Texto
		char genero = 'F';
		
		//Lógico
		boolean isVisible = true;
		boolean funciona = false;
		
		int variable = 2;
		int Variable = 3;
		int _variable = 4;
		int $variable = 5;
	
		
		//Constantes
		int VALOR = 0;
		int VALOR_MAXIMO = 1;

		//Lower Camel Case, el nombre de las variables, objetos y métodos
		int minValor =4;
		
		byte b = 6;
		short s = b;
		
		b = (byte) s; //aquí estamos especificando por medio de cast definido
		//que ahora nuestra variable s, que es de tipo short
		//pasa a ser de tipo byte.
	
		
		int i = 1;
		double d = 2.5; 
		i= (int) d;
		
		int codigo = 97;
		char codigoASCII = (char) codigo;
		
		short numero = 300;
		byte numerobyte = (byte) numero;
		
		
		//Arrays
		//Declaración de arrays
				
		int[] arregloInt = new int[2];
		double arregloDouble[];
		
		int[][] array2D = new int[2][3]; //[renglón], [columna]. Caben 6 "galletitas"
		int[][][] array3D = new int[3][3][2]; //[regnlón], [columna], [altura]. Caben 18 "galletitas"
		//int[][][][] array4D = new int[1][2][3][4];
		
		char[][] days ={{'M','T','W'}, {'M','T','W'}};
		
		char[] names = new char[4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		
		char [][][][] monkey = new char[2][3][2][2];
		monkey[1][0][0][1] = 'M';
		System.out.println(monkey[1][0][0][1]);
				
		//System.out.println(numerobyte);
		
		//Operadores aritméticos
		int a = 1;
		int aa = a + a;
		//System.out.println("el valor de aa: " + aa);
		
		double x = 2.56;
		int y = 9;
		
		float w = (float)x + y;
		//System.out.println(w);
		
		//System.out.println(w*2);
		
		double k = 4/0.00002;
		
		//System.out.println(k);
		
		//System.out.println(7%2);
		
		int f = 2;
		int g = 3;
		//f = f + g;
		f += g;
		//System.out.println(f);
		
		//Operador incremento, decremento
		int l = 3;
		l++;
		++l;
		//System.out.println(l);
		
		
		//al usar ++l
		//1. Incrementa el valor   l + 1
		//2. Asignar el valor a l  l = l
		
		//al usar l++
		//1. Asignar el valor a l  l = l
		//2. Incrementa el valor   l + 1
		
		//Operadoes equidad
		
		int q = 5;
		int p = 5;
		System.out.println(q != p);
		
		//Operadores relacionales
		System.out.println("q > p -> " + (q > p));
		System.out.println("q < p -> " + (q < p));
		
		System.out.println("q >= p -> " + (q >= p));
		System.out.println("q <= p -> " + (q <= p));
		
		//Operadores lógicos
		boolean n = false;
		boolean m = true;
		
		System.out.println("n= " + (n));
		System.out.println("m= " + (m));
		System.out.println("n && m -> " + (n && m));
		System.out.println("n || m -> " + (n || m));
		System.out.println("!n ->" + (!n));
		
		
		//Control de flujo
		//If/Else
		
		if (q > p) {
			System.out.println("Es mayor");
		} else if (q == p){
			System.out.println("Es igual");
		} else {
			System.out.println("No es mayor y no es igual");
		}
		
		
		//Switch
		
		int mes = 8; 
		
		switch (mes) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;

			default:
				System.out.println("No existe ese mes");
				break;
		}
		
		
		//Bucle While
		int e = 1;
		while(e < 5) {
			System.out.println("e es menor o igual que 5");
			e++;
		}
		
		int[] numeros = new int[5];
		for(int c = 0; c < 5; c++) {
			numeros[c] = c;
			System.out.println("numeros["+c+"]: " + numeros[c]);
		}
		
		for (int j : numeros) {
			System.out.println(j);	
		}
		
		//System.out.println("continuamos con el flujo");
		}
		
	}
