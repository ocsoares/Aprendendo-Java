package studyNotes.exceptions.date;

import java.time.LocalDate;

public class MainDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println("ANO atual: " + currentDate.getYear());
        System.out.println("MÊS atual: " + currentDate.getMonth());
        System.out.println("Números de DIAS do MÊS atual: " + currentDate.lengthOfMonth());
        System.out.println("DIA atual: " + currentDate.getDayOfMonth());
        System.out.println("DIA da SEMANA atual: " + currentDate.getDayOfWeek());

        LocalDate currentDatePlusTwoDays = currentDate.plusDays(2);
        System.out.println("currentDatePlusTwoDays: " + currentDatePlusTwoDays);

        LocalDate currentDatePlusThreeMonths = currentDate.plusMonths(3);
        System.out.println("currentDatePlusThreeMonths: " + currentDatePlusThreeMonths);
    }
}
