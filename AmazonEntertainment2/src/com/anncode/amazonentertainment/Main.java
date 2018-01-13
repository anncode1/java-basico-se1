package com.anncode.amazonentertainment;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}

	private static void showMenu() {
		int exit = 1;
		do {
			System.out.println(":: A M A Z O N     E N T E R T A I N M E N T ::");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Make Report");
			System.out.println("6. Make Report Today"); //mostrará ordenado por fecha
			System.out.println("0. Exit");
			System.out.println();

			//Leer respuesta del usuario

			int response = 1;
			switch (response) {
			case 0:
				//salir
				exit = 0;
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				//				makeReport();
				break;
			case 6:
				//				makeReport(new Date());
				break;

			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción!!....");
				System.out.println();
				break;
			}

		}while(exit != 0);
	}

	//	private static void makeReport(Date date) {
	//		// TODO Auto-generated method stub
	//		
	//	}
	//	
	//	private static void makeReport() {
	//		// TODO Auto-generated method stub
	//		
	//	}

	private static void showMagazines() {
		// TODO Auto-generated method stub
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
			//Show movie's name
			showMagazinesName();

			//Leer respuesta del usuario

			int response = 0;


		}while(exit != 0);
	}

	private static void showMagazinesName() {
		// TODO Auto-generated method stub
		
	}

	private static void showBooks() {
		// TODO Auto-generated method stub
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
			//Show movie's name
			showBooksName();

			//Leer respuesta del usuario

			int response = 0;


		}while(exit != 0);
	}

	private static void showBooksName() {
		// TODO Auto-generated method stub
		
	}

	private static void showSeries() {
		// TODO Auto-generated method stub
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			//Show movie's name
			showSeriesName();

			//Leer respuesta del usuario

			int response = 0;


		}while(exit != 0);
	}

	private static void showSeriesName() { //Movie object array
		// TODO Auto-generated method stub

	}

	private static void showMovies() {
		// TODO Auto-generated method stub
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			//Show movie's name
			showMoviesName();

			//Leer respuesta del usuario

			int response = 0;


		}while(exit != 0);
	}

	private static String[] showMoviesName() { //Movie object array
		return null;
	}

}
