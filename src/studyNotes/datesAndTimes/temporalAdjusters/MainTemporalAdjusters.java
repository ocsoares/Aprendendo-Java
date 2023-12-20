package studyNotes.datesAndTimes.temporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class MainTemporalAdjusters {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate: " + currentDate);

        // Retorna em DATA (YY-MM-DD) a PRÓXIMA quarta-feira!!!
        LocalDate nextWednesday = currentDate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("nextWednesday: " + nextWednesday);
        System.out.println("nextWednesday DIA DO MÊS: " + nextWednesday.getDayOfMonth());

        System.out.println("\n");

        LocalDate previousWednesday = currentDate.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println("previousWednesday: " + previousWednesday);
        System.out.println("previousWednesday DIA DO MÊS: " + previousWednesday.getDayOfMonth());

        System.out.println("\n");

        LocalDate lastDayOfCurrentMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfCurrentMonth: " + lastDayOfCurrentMonth);
        System.out.println("lastDayOfCurrentMonth DIA DA SEMANA: " + lastDayOfCurrentMonth.getDayOfWeek());

        System.out.println("\n");

        LocalDate firstDayOfNextYear = currentDate.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("firstDayOfNextYear: " + firstDayOfNextYear);
        System.out.println("firstDayOfNextYear DIA DA SEMANA: " + firstDayOfNextYear.getDayOfWeek());
    }
}
