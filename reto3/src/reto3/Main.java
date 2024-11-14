package reto3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	static String formatoTexto = "dd/MM/yyyy";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte fecha");
		LocalDate fecha1 = dameFecha("Inserte primera fecha", sc);
		LocalDate fecha2;
		do {
			System.out.println("Inserte fecha");
			fecha2 = dameFecha("Inserte segunda fecha", sc);

			if (fecha1.isBefore(fecha2)) {
				break;
			} else {
				System.out.println("Fecha 2 debe ir despues de fecha 1");
			}
		} while (true);

		if (fecha1.getYear() == fecha2.getYear()) {
			// Funciones 1 - David
			Funciones1.diferenciaMeses(fecha1, fecha2, sc);
		} else {
			// Funciones 2 - Rafa
			Funciones2.media(sc, fecha1, fecha2);
		}
	}

	public static LocalDate dameFecha (String texto, Scanner sn) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern(formatoTexto);
		while (true) {
			try {
				System.out.println(texto);
				System.out.println("FORMATO: "+formatoTexto);
				return LocalDate.parse(sn.nextLine(), formato);
			} catch (Exception e) {
				System.out.println("Fecha no valida");
			}
		}
	}
}
