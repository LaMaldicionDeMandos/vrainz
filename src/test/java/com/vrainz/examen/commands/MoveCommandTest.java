package com.vrainz.examen.commands;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.vrainz.examen.shapes.Position;
import com.vrainz.examen.shapes.Shape;
import com.vrainz.examen.shapes.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by boot on 1/20/16.
 */
public class MoveCommandTest {
    private List<Shape> shapes;

    @Before
    public void before() {
        shapes = Lists.newArrayList(new Square("cuadrado", 10));
    }

    @Test
    public void should_move_the_shape_with_name_cuadrado() {
        Map<String, String> map = Maps.newHashMap();
        map.put("x", "2");
        map.put("y", "4");
        MoveCommand command = new MoveCommand("cuadrado", map);
        Shape shape = command.execute(shapes);
        assertEquals("cuadrado", shape.getName());
        assertEquals(new Position(2, 4), shape.getPosition());
    }

    @Test
    public void should_move_only_x_the_shape_with_name_cuadrado() {
        Map<String, String> map = Maps.newHashMap();
        map.put("x", "2");
        MoveCommand command = new MoveCommand("cuadrado", map);
        Shape shape = command.execute(shapes);
        assertEquals("cuadrado", shape.getName());
        assertEquals(new Position(2, 0), shape.getPosition());
    }

    @Test
    public void should_move_only_y_the_shape_with_name_cuadrado() {
        Map<String, String> map = Maps.newHashMap();
        map.put("y", "2");
        MoveCommand command = new MoveCommand("cuadrado", map);
        Shape shape = command.execute(shapes);
        assertEquals("cuadrado", shape.getName());
        assertEquals(new Position(0, 2), shape.getPosition());
    }
}
