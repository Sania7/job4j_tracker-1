package ru.job4j.tracker;

public class SingleTrackerThree {
    public static final SingleTrackerThree INSTANCE = new SingleTrackerThree();
    private Tracker tracker;
    private SingleTrackerThree() {
        tracker = new Tracker();
    }

    public static SingleTrackerThree getINSTANCE() {
        return INSTANCE;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        SingleTrackerThree singleTrackerThree = SingleTrackerThree.getINSTANCE();
    }
}
