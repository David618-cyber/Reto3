package reto3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Funciones1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.now();
		LocalDate ld = LocalDate.now();
		diferenciaMeses(fecha1, fecha2, sc);
	}

	public static void diferenciaMeses(LocalDate fecha1, LocalDate fecha2, Scanner sc) {
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
		System.out.println("La diferencia de meses entre las dos fechas es:" + meses);
		if (meses < 3) {
			for (int i = 0; i <= 4; i++) {
				System.out.println("Introduce" + i + "." + "numero por pantalla:");
				String resultado1= sc.nextLine();
			}
		} else {
			System.out.println("Introduce " + meses + "nombres por consola:");
			String resultado2= sc.nextLine();
		}

	}
	public static void tamañoMasPequeño( String resultado1, String resultado2, Scanner sc){
		String pequeño;
		String s = null;
		int len = s.length();
		
	}

}
