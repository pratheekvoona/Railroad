package com.example.pratheekvoona.railroad;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class Schedule {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY


    }
    private String semester;
    private HashMap<Day, Set<Entry>> regularEntries = new HashMap<>();
    private HashMap<Date, Set<Entry>> singleEntries = new HashMap<>();
    private HashMap<CourseOffering,String > courseOfferings = new HashMap<>();

    public Schedule(String semester, HashMap<Day, Set<Entry>> regularEntries, HashMap<Date, Set<Entry>> singleEntries, List<Entry> getEntriesByDate) {
        this.semester = semester;
        this.regularEntries = regularEntries;
        this.singleEntries = singleEntries;

    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public HashMap<Day, Set<Entry>> getRegularEntries() {
        return regularEntries;
    }

    public void setRegularEntries(HashMap<Day, Set<Entry>> regularEntries) {
        this.regularEntries = regularEntries;
    }

    public HashMap<Date, Set<Entry>> getSingleEntries() {
        return singleEntries;
    }

    public void setSingleEntries(HashMap<Date, Set<Entry>> singleEntries) {
        this.singleEntries = singleEntries;
    }

    public Set<Entry> getEntriesByDate(Date date) {
        if (singleEntries.containsKey(date)) {
            return singleEntries.get(date);
        }
        return null;
    }

    public void addEntryByDay(Entry entry, Day day) {


            if(regularEntries.containsKey(day)) {
                regularEntries.get(day).add(entry);
            } else {
                Set<Entry> newEntry = new HashSet<>();
                newEntry.add(entry);
                regularEntries.put(day,newEntry);
            }


    }

    /*public static void main(String[] args) {
        //SimpleDateFormat myDate = new SimpleDateFormat("MM-dd-yyyy",Locale.ENGLISH);
        //Date date = myDate.parseObject("07-12-2019");
        //System.out.println(date.getDate());
        //System.out.println(date.getMonth());
        //System.out.println(date.getYear());
        SimpleDateFormat myDate = new SimpleDateFormat("MM-dd-yyyy",Locale.ENGLISH);
        ParsePosition pp = new ParsePosition(0);
        Date date = myDate.parse("01-07-2001",pp);
        System.out.println(date);
    }*/
    public void addEntryByDate (Entry entry, String toAdd) {

            /*int month = Integer.parseInt(toAdd.substring(0,2));
            int day = Integer.parseInt(toAdd.substring(2,4));
            int year = Integer.parseInt(toAdd.substring(4));*/
            SimpleDateFormat myDate = new SimpleDateFormat("MM-dd-yyyy",Locale.ENGLISH);
            ParsePosition pp = new ParsePosition(0);
            Date date = myDate.parse(toAdd,pp);
            if(singleEntries.containsKey(date)) {
                singleEntries.get(date).add(entry);
            } else {
                Set<Entry> newEntry = new HashSet<>();
                newEntry.add(entry);
                singleEntries.put(date,newEntry);
            }



    }
    public void addClass(CourseOffering courseOffering, String Day) {
        courseOfferings.put(courseOffering,Day);
    }
    public void removeClass(CourseOffering courseOffering) {
        courseOfferings.remove(courseOffering);
    }
}
