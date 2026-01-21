package com.mycompany.aaarascunho;

public class Enumeration {

    public static void main(String[] args) {

        // System.out.println(Day.FRIDAY);
        // System.out.println(Day.valueOf("FRIDAY"));
        // System.out.println(Day.values());
        //
        // Day day = Day.MONDAY;
        //
        // System.out.println(day);
        //
        // for (Day d : Day.values()) {
        // System.out.println(d);
        // }

        System.out.println(Day2.FRI);
        System.out.println(Day2.valueOf("FRI"));
        System.out.println(Day2.values());

        Day2 day2 = Day2.MON;

        System.out.println(day2);

        for (Day2 d : Day2.values()) {
            System.out.println(d);
            System.out.println(d.name());
            System.out.println(d.getValue());
        }

    }

}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Day2 {
    SUN("Sunday"), MON("Monday"), TUE("Tuesday"),
    WED("Wednesday"), THU("Thursday"), FRI("Friday"), SAT("Saturday");

    private final String value;

    Day2(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}