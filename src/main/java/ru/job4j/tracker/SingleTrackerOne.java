package ru.job4j.tracker;

public enum SingleTrackerOne {
    INSTANCE;
    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        Tracker tracker = INSTANCE.getTracker();
    }
}
