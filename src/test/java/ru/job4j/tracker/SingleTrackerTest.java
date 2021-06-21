package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class SingleTrackerTest {
    @Test
    public void trackerOne() {
        SingleTrackerOne singleTrackerOne = SingleTrackerOne.INSTANCE;
        SingleTrackerOne singleTrackerOne1 = SingleTrackerOne.INSTANCE;
        assertThat(singleTrackerOne, is(singleTrackerOne1));
    }
    @Test
    public void trackerTwo() {
        SingleTrackerTwo singleTrackerTwo = SingleTrackerTwo.getInstance();
        SingleTrackerTwo singleTrackerTwo1 = SingleTrackerTwo.getInstance();
        assertThat(singleTrackerTwo, is(singleTrackerTwo1));
    }
    @Test
    public void trackerThree() {
        SingleTrackerThree singleTrackerThree = SingleTrackerThree.getINSTANCE();
        SingleTrackerThree singleTrackerThree1 = SingleTrackerThree.getINSTANCE();
        assertThat(singleTrackerThree, is(singleTrackerThree1));
    }
    @Test
    public void trackerFour() {
        SingleTrackerFour singleTrackerFour = SingleTrackerFour.getInstance();
        SingleTrackerFour singleTrackerFour1 = SingleTrackerFour.getInstance();
        assertThat(singleTrackerFour, is(singleTrackerFour1));
    }
}