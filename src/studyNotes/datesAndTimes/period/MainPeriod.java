package studyNotes.datesAndTimes.period;

import java.time.LocalDate;
import java.time.Period;

public class MainPeriod {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate: " + currentDate);

        LocalDate currentDatePlusThreeYears = currentDate.plusYears(3);
        System.out.println("currentDatePlusThreeYears: " + currentDatePlusThreeYears);

        // Esse "Period between" retorna a Diferença em STRING, com um "P" Inicial!!!
        // OBS: Utilizar o "ChronoUnit" para retornar a Diferença MAIS CORRETAMENTE!!
        Period dateBetweenNowAndPlusThreeYears = Period.between(currentDate, currentDatePlusThreeYears);
        System.out.println("dateBetweenNowAndPlusThreeYears: " + dateBetweenNowAndPlusThreeYears);

        LocalDate currentDatePlusTwoYearsAndFourMonths = currentDate.plusYears(2).plusMonths(4);
        Period dateBetweenNowAndPlusTwoYearsAndFourMonths = Period.between(
                currentDate, currentDatePlusTwoYearsAndFourMonths);
        System.out.println("dateBetweenNowAndPlusTwoYearsAndFourMonths: " + dateBetweenNowAndPlusTwoYearsAndFourMonths);
    }
}
