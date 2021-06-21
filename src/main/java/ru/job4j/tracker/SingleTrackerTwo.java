package ru.job4j.tracker;

public class SingleTrackerTwo {
    private static SingleTrackerTwo instance;
    private Tracker tracker;

    private SingleTrackerTwo() {
        tracker = new Tracker();
    }

    public static SingleTrackerTwo getInstance() {
        if (instance == null) {
            instance = new SingleTrackerTwo();
        }
        return instance;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        SingleTrackerOne singleTrackerOne = SingleTrackerOne.INSTANCE;
        SingleTrackerTwo singleTrackerTwo = SingleTrackerTwo.getInstance();
    }
}
