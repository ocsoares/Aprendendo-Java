package studyNotes.time;

import java.time.LocalTime;

public class MainTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime: " + currentTime);
        System.out.println("currentTime HORAS: " + currentTime.getHour());
        System.out.println("currentTime MINUTOS: " + currentTime.getMinute());
        System.out.println("currentTime SEGUNDOS: " + currentTime.getSecond());

        System.out.println("\n");

        LocalTime specificTime = LocalTime.of(17, 42, 52);
        System.out.println("specificTime: " + specificTime);
        System.out.println("specificTime HORAS: " + specificTime.getHour());
    }
}
