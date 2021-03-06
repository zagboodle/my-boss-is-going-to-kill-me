package com.zagboodle.games.mbigtkm.gameplay;

import com.zagboodle.games.mbigtkm.locations.Location;
import com.zagboodle.games.mbigtkm.locations.Section;

import java.util.ArrayList;

public class Util {
    protected static ArrayList<Location> locations;

    public static Section getSection(String name) {
        Location location = getLocation(name);
        if (location != null)
            return location.getDefaultSection();
        else
            return new Section();
    }

    public static Section getSection(String name, int i) {
        Location location = getLocation(name);
        if (location != null)
            return location.getSection(i);
        else
            return new Section();
    }

    protected static Location getLocation(String name) {
        for (Location location : locations) {
            if (location.getName().equalsIgnoreCase(name)) {
                return location;
            }
        }
        return new Location();
    }

    public static ArrayList<Location> getLocations() {
        return locations;
    }

    public static void setLocations(ArrayList<Location> locations) {
        Util.locations = locations;
    }
}
