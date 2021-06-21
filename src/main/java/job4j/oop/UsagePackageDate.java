package job4j.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//6. Date. Отображение даты. [#310017 #117335]

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); //Дата сейчас
        LocalTime currentTime = LocalTime.now(); // Время сейчас

        // до форматирования
        LocalDateTime currentDateTime = LocalDateTime.now(); // Дата и время сейчас

        // после форматирования
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущая дата: " + currentDate);
        System.out.println("Текущее время: " + currentTime);
        System.out.println("Текущая дата и время до форматирования : " + currentDateTime);
        System.out.println("Текущие время и дата после форматирования: " + currentDateTimeFormat);
    }
}
