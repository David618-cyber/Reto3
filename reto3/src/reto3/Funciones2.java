package reto3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Funciones2 {
    public static void media(Scanner sn, LocalDate fecha1, LocalDate fecha2) {
        float dias;
        float meses;

        dias = (int) ChronoUnit.DAYS.between((fecha1.with(TemporalAdjusters.firstDayOfMonth())), (fecha2.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth())));
        meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
        System.out.println(dias);
        System.out.println(meses);
        System.out.println("La media de dias es: "+(dias/meses));
    }
}
