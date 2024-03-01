package org.wardenhd.main;

// import javax.swing.*;

import java.util.Calendar;
import java.util.Date;

public class Main {
    // private static final JFrame frame = new JFrame("Window App");

    // private static final WindowManager windowManager = new WindowManager(frame);

    private static final double athensLatitude = 37.983917;
    private static final double athensLongitude = 23.72936;

    protected static String name = "Artem";
    protected static String surname = "Bezruchko";

    public static final int currentYear = Calendar.getInstance().get(Calendar.YEAR); // normal code
    public static final int birthdayYear = 2009;

    public static void main(String[] args) {
        // windowManager.createWindow();

        System.out.println("Athens longitude: " + athensLongitude + "\nAthens latitude: " + athensLatitude); // bad code heh

        System.out.println(name + " " + surname);

        System.out.println("Age: " + (currentYear - birthdayYear) + " (it's actually 14)"); // noooo, it's 14!!!
    }
}