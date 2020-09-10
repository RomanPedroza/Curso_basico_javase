package com.titaniumsolutions.linecounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("C:\\Users\\gilsa\\RomanPedroza\\Romancho\\JAVACourse\\AmazonViewer\\src\\com\\titaniumsolutions\\amazonviewer\\Main.java"); //Trayendo el archivo a leer
		int lines = 0;					   //Inicializando la variable "lines"
		int usedClasses = 0;				   //Inicializando la variable "usedClasses"
		int usedMethods = 0;			   //Inicializando la variable "used"
		
		FileReader fr = new FileReader(file);//FileReader es útil para leer los bytes
		BufferedReader br = new BufferedReader(fr);//BufferedReader acelera el proceso de FileReader
		
		
		String line;
		
		while ((line = br.readLine()) != null) 
		{

			line = line.trim();
			if ((!line.equals("")) && (!line.contains("//")) && (!line.contains("/*")) && (!line.contains("*")) && (!line.contains("*/")) && (!line.contains("import")) && (!line.contains("package")) ) {//Eliminando saltos de línea, comments, líneas de import y lineas de package
				lines++;
				
				if ((line.contains("class"))) {
					usedClasses++;
				}

				if ((line.contains("void")) || (line.contains("return"))) {
					usedMethods++;
				}
			}

		}
		
		fr.close();
		
		System.out.println("Total number of lines in the File: " + lines);
		System.out.println("Amount of classes used in the File:" + usedClasses);
		System.out.println("Amount of methods used in the File:" + usedMethods);
	}
}
