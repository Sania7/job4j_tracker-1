package ru.job4j.tracker;


// 2. Singleton [#94606 #117340]

public final class SingleTrackerFour {
    private Tracker tracker;

    private SingleTrackerFour() {
        tracker = new Tracker();
    }
    public static SingleTrackerFour getInstance() {
        return Holder.INSTANSE;
    }
    public Tracker getTracker() {
        return tracker;
    }

    private static final class Holder {
        private static final SingleTrackerFour INSTANSE = new SingleTrackerFour();
    }

    public static void main(String[] args) {
        SingleTrackerFour tracker = SingleTrackerFour.getInstance();
    }
}
