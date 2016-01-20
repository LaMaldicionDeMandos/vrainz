package com.vrainz.examen.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by boot on 1/19/16.
 */
public class PositionTest {
    @Test(expected = IllegalArgumentException.class)
    public void should_fail_if_try_to_create_a_position_with_x_bigger_than_9() {
        new Position(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_if_try_to_create_a_position_with_negative_x() {
        new Position(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_if_try_to_create_a_position_with_y_bigger_than_9() {
        new Position(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_if_try_to_create_a_position_with_negative_y() {
        new Position(0, -1);
    }

    @Test
    public void two_positions_with_diferent_x_or_y_should_be_not_equals() {
        Position p1 = new Position(2,5);
        Position p2 = new Position(2,4);
        Position p3 = new Position(3,4);
        assertNotEquals(p1, p2);
        assertNotEquals(p3, p2);
    }

    @Test
    public void should_create_an_empty_position_with_x_and_y_zero() {
        Position p = new Position();
        Assert.assertEquals(0, p.getX());
        Assert.assertEquals(0, p.getY());
    }
}
