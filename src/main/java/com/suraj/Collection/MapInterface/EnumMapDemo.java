package com.suraj.Collection.MapInterface;

import java.util.EnumMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        // Example usage of EnumMap
        EnumMap<Day,String> week=new EnumMap(Day.class);
        week.put(Day.MONDAY, "Monday");
        week.put(Day.TUESDAY, "Tuesday");
        week.put(Day.WEDNESDAY, "Wednesday");
        week.put(Day.THURSDAY, "Thursday");
        week.put(Day.FRIDAY, "Friday");
        week.put(Day.SATURDAY, "Saturday");
        week.put(Day.SUNDAY, "Sunday");
        // Display the EnumMap
        System.out.println("Days of the week:");
        for (Day day : week.keySet()) {
            System.out.println(day + ": " + week.get(day));
        }
        // Check if a specific day is present
        Day checkDay = Day.WEDNESDAY;
        if (week.containsKey(checkDay)) {
            System.out.println(checkDay + " is present in the EnumMap.");
        } else {
            System.out.println(checkDay + " is not present in the EnumMap.");
        }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
}

