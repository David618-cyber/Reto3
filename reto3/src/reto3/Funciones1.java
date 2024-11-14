package reto3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Funciones1 {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.now();
		LocalDate ld = LocalDate.now();
		diferenciaMeses(fecha1, fecha2, sc);
	}
	*/

	public static void diferenciaMeses(LocalDate fecha1, LocalDate fecha2, Scanner sc) {
		if (fecha1.getMonth() != fecha2.getMonth()) {
			int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);

			int longitud = 0;
			String nombre = "";
			String nombreCorto = "";
			boolean primerNombre = true;



			if (meses > 3) {

				for (int i = 0; i < meses; i++) {
					System.out.println("Insera nombre: ");
					nombre = sc.nextLine();
					if (primerNombre) {
						longitud = nombre.length();
						primerNombre = false;
					}

					if (nombre.length() < longitud) {
						longitud = nombre.length();
						nombreCorto = nombre;
					}
				}

				System.out.println("El nombre mas corto es: "+nombreCorto);
			} else {
				for (int i = 0; i < 4; i++) {
					System.out.println("Insera nombre: ");
					nombre = sc.nextLine();
					if (primerNombre) {
						longitud = nombre.length();
						primerNombre = false;
					}

					if (nombre.length() < longitud) {
						longitud = nombre.length();
						nombreCorto = nombre;
					}
				}

				System.out.println("El nombre mas corto es: "+nombreCorto);
			}

			for (int i = 0; i < nombre.length(); i++) {
				switch (nombre.charAt(i)) {
					case 'a','e','i','o','u' -> {
						if (i == nombre.length() -1) {
							System.out.print(nombre.charAt(i));
						} else {
							System.out.print(nombre.charAt(i)+"-");
						}
					}
				}
			}
		}
	}

}
