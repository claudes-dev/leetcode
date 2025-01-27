package Estudos;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.TimeZone;

public class StudyTimezone {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.out.println("Fuso horário padrão: " + TimeZone.getDefault().getID());

        System.out.println(LocalDateTime.now());
        System.out.println(OffsetDateTime.now());
    }
    
}
