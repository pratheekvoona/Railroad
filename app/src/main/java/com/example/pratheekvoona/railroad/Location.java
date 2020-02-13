package com.example.pratheekvoona.railroad;

public class Location {
    private Building building;
    private String room;

    public Location(Building building, String room) {
        this.building = building;
        this.room = room;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
