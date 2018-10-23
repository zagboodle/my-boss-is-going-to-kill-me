package com.zagboodle.games.mbigtkm.locations;

import java.util.ArrayList;

public class Section {

    private Location location;
    private String name;
    private String description;
    private ArrayList<Exit> exits;

    public Section(Location location) {
        this.location = location;
        this.name = location.getName();
        this.description = location.getDescription();
        this.exits = new ArrayList<Exit>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void addExit(Exit exit) {
        exits.add(exit);
    }

    public Exit getDefaultExit() {
        return exits.get(0);
    }

    public Exit getExit(Direction direction) {
        for (Exit exit : exits) {
            if (exit.getDirection() == direction) {
                return exit;
            }
        }
        return null;
    }

    public Location getLocation() {
        return location;
    }
}
