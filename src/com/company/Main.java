package com.company;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance ();
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.YEAR, 2021);
        System.out.println(cal);
    }
}
