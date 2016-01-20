package com.vrainz.examen.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by boot on 1/20/16.
 */
public class SquareTest extends ShapeTest {
    @Override
    protected Shape createShape(String name) {
        return new Square(name, 10);
    }

    @Test
    public void should_has_a_surface_of_side_multipli_by_side() {
        Square square = new Square(NAME, 3);
        assertEquals(9, square.calculateSurface(), .0000001);
    }
}
