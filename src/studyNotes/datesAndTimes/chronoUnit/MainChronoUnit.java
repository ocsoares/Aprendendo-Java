package studyNotes.datesAndTimes.chronoUnit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MainChronoUnit {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate currentDatePlusThreeYears = currentDate.plusYears(3);

        long yearsBetweenCurrentDatePlusThreeYears = ChronoUnit.YEARS.between(currentDate, currentDatePlusThreeYears);
        System.out.println("yearsBetweenCurrentDatePlusThreeYears: " + yearsBetweenCurrentDatePlusThreeYears);

        long daysBetweenCurrentDatePlusThreeYears = ChronoUnit.DAYS.between(currentDate, currentDatePlusThreeYears);
        System.out.println("daysBetweenCurrentDatePlusThreeYears: " + daysBetweenCurrentDatePlusThreeYears);

        LocalDate currentDatePlusTwoMonths = currentDate.plusMonths(2);
        long monthsBetweenCurrentDatePlusTwoMonths = ChronoUnit.MONTHS.between(currentDate, currentDatePlusTwoMonths);
        System.out.println("monthsBetweenCurrentDatePlusTwoMonths: " + monthsBetweenCurrentDatePlusTwoMonths);
    }
}
