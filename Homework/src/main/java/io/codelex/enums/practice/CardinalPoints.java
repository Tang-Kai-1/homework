package io.codelex.enums.practice;

public enum CardinalPoints {
    NORTH("North", "Up", 0),
    SOUTH("South", "Down", 1),
    EAST("East", "Right", 2),
    WEST("West", "Left", 3);

    private final String compass;
    private final String direction;
    private final int value;

    CardinalPoints(String compass, String direction, int value) {
        this.compass = compass;
        this.direction = direction;
        this.value = value;
    }

    public static void printEnums() {
        for (CardinalPoints point : CardinalPoints.values()) {
            System.out.println(point.compass + ":" + point.direction + ":" + point.value);
        }
    }
}
