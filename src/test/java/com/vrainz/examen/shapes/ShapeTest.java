package com.vrainz.examen.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boot on 1/20/16.
 */
public abstract class ShapeTest {
    protected final String NAME = "name";
    private final Position POSITION = new Position(1,2);
    protected abstract Shape createShape(String name);

    @Test
    public void should_create_a_shape_with_name() {
        Shape shape = createShape(NAME);
        assertEquals(NAME, shape.getName());
    }

    @Test
    public void should_move_shape_to_1_2() {
        Shape shape = createShape(NAME);
        shape.moveTo(POSITION);
        assertEquals(POSITION, shape.getPosition());
    }

    @Test
    public void should_move_shape_to_1_2_with_x_and_y() {
        Shape shape = createShape(NAME);
        shape.moveTo(1,2);
        assertEquals(POSITION, shape.getPosition());
    }
}
