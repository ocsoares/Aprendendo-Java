package studyNotes.date;

import java.time.LocalDate;
import java.time.Month;

public class MainDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println("ANO atual: " + currentDate.getYear());
        System.out.println("MÊS atual: " + currentDate.getMonth());
        System.out.println("Números de DIAS do MÊS atual: " + currentDate.lengthOfMonth());
        System.out.println("DIA atual: " + currentDate.getDayOfMonth());
        System.out.println("DIA da SEMANA atual: " + currentDate.getDayOfWeek());

        System.out.println("\n");

        LocalDate specificDate = LocalDate.of(2020, Month.MAY, 15);
        System.out.println("specificDate: " + specificDate);
        System.out.println("ANO atual da DATA ESPECÍFICA: " + specificDate.getYear());

        System.out.println("\n");

        LocalDate currentDatePlusTwoDays = currentDate.plusDays(2);
        System.out.println("currentDatePlusTwoDays: " + currentDatePlusTwoDays);

        LocalDate currentDatePlusThreeMonths = currentDate.plusMonths(3);
        System.out.println("currentDatePlusThreeMonths: " + currentDatePlusThreeMonths);
    }
}
