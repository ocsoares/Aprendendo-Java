package studyNotes.dateAndTime;

import java.time.LocalDateTime;

// "LocalDateTime" é uma JUNÇÃO de "LocalDate" (DATA) e "LocalTime" (HORÁRIO)!!!
public class MainDateAndTime {
    public static void main(String[] args) {
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("currentDateAndTime: " + currentDateAndTime);
        System.out.println("currentDateAndTime HORAS: " + currentDateAndTime.getHour());
        System.out.println("currentDateAndTime ANO: " + currentDateAndTime.getYear());

        LocalDateTime currentDateWithSpecificTime = currentDateAndTime.toLocalDate().atTime(21, 32, 49);
        System.out.println("currentDateWithSpecificTime: " + currentDateWithSpecificTime);
    }
}
