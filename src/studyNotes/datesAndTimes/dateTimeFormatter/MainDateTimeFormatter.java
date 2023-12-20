package studyNotes.datesAndTimes.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate: " + currentDate);
        System.out.println("\n");

        DateTimeFormatter brazilianFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String brazilianCurrentDate = currentDate.format(brazilianFormatter); // Retornará em STRING!!!
        System.out.println("brazilianCurrentDate: " + brazilianCurrentDate);

        System.out.println("\n");

        LocalDate parseBrazilianCurrentDateToLocalDate = LocalDate.parse(brazilianCurrentDate, brazilianFormatter);
        System.out.println("parseBrazilianCurrentDateToLocalDate: " + parseBrazilianCurrentDateToLocalDate);
        System.out.println(
                "parseBrazilianCurrentDateToLocalDate MÊS: " + parseBrazilianCurrentDateToLocalDate.getMonth());

        System.out.println("\n");

        DateTimeFormatter franceFormatterLocale = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String franceCurrentDateLocale = LocalDate.now().format(franceFormatterLocale);
        System.out.println("franceCurrentDateLocale: " + franceCurrentDateLocale);
    }
}
