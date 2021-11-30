package com.amenity_reservation_system.model;
public enum AmenityType {
    POOL("POOL"), CLUB_HOUSE("CLUB_HOUSE"), GYM("GYM");

    private final String name;

    private AmenityType(String value) {
        name = value;
    }

    @Override
    public String toString() {
        return name;
    }
}