package com.example.pratheekvoona.railroad;

public class Building {

    class coordinates {
        double x;
        double y;

        public coordinates() {

        }

        public coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double getx() {
            return x;
        }

        public void setx(double x) {
            this.x = x;
        }

        public double gety() {
            return y;
        }

        public void sety(double y) {
            this.y = y;
        }
    }
    class activeHours {
        int start;
        int end;

        public activeHours() {

        }

        /*public activeHours(int start, int end) {
            this.start = start;
            this.end = end;
        }*/

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }
        private int using;
        public void setEnd(int end) {
            this.end = end;
        }
    }
    private activeHours myActive = new activeHours();

    private coordinates myCoordinates = new coordinates();
    private String buildingCode;
    private String address;

    public Building(String buildingCode, String address, activeHours myActive, coordinates myCoordinates) {
        this.buildingCode = buildingCode;
        this.address = address;
        this.myActive = myActive;
        this.myCoordinates = myCoordinates;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public activeHours getMyActive() {
        return myActive;
    }

    public void setMyActive(activeHours myActive) {
        this.myActive = myActive;
    }

    public coordinates getMyCoordinates() {
        return myCoordinates;
    }

    public void setMyCoordinates(coordinates myCoordinates) {
        this.myCoordinates = myCoordinates;
    }
}
