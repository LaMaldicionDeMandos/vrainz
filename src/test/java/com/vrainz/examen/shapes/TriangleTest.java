package com.vrainz.examen.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boot on 1/20/16.
 */
public class TriangleTest extends ShapeTest {
    @Override
    protected Shape createShape(String name) {
        return new Triangle(name, 10, 5);
    }

    @Test
    public void should_has_a_surface_of_base_multipli_by_height_divide_by_two() {
        Triangle square = new Triangle(NAME, 3, 4);
        assertEquals(6, square.calculateSurface(), .0000001);
    }
}
