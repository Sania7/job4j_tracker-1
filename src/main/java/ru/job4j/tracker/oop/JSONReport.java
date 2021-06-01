package ru.job4j.tracker.oop;


//5. Аннотация @Override [#174891 #117351]
public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{ " + System.lineSeparator() + name + " name" + "," + System.lineSeparator() +
                body + " body" + System.lineSeparator() + "}";
     }
}
