package com.vrainz.examen.commands;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.vrainz.examen.shapes.Position;
import com.vrainz.examen.shapes.Shape;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by boot on 1/20/16.
 */
public class TriangleCommandTest {
    private List<Shape> shapes;

    @Before
    public void before() {
        shapes = Lists.newArrayList();
    }
    @Test
    public void should_create_a_basic_triangle() {
        Map<String, String> map = Maps.newHashMap();
        map.put(TriangleCommand.BASE, "10");
        map.put(TriangleCommand.HEIGHT, "5");
        Command command = new TriangleCommand("name", map);
        Shape shape = command.execute(shapes);

        assertEquals("name", shape.getName());
        assertEquals("black", shape.getColor());
        assertEquals(new Position(), shape.getPosition());
        assertEquals(25, shape.calculateSurface(), .000001);
    }

    @Test
    public void should_create_a_red_triangle() {
        Map<String, String> map = Maps.newHashMap();
        map.put(TriangleCommand.BASE, "10");
        map.put(TriangleCommand.HEIGHT, "5");
        map.put(Command.COLOR, "red");
        Command command = new TriangleCommand("name", map);
        Shape shape = command.execute(shapes);

        assertEquals("name", shape.getName());
        assertEquals("red", shape.getColor());
        assertEquals(new Position(), shape.getPosition());
        assertEquals(25, shape.calculateSurface(), .000001);
    }

    @Test
    public void should_create_a_triangle_in_2_4() {
        Map<String, String> map = Maps.newHashMap();
        map.put(TriangleCommand.BASE, "10");
        map.put(TriangleCommand.HEIGHT, "5");
        map.put(Command.X, "2");
        map.put(Command.Y, "4");
        Command command = new TriangleCommand("name", map);
        Shape shape = command.execute(shapes);

        assertEquals("name", shape.getName());
        assertEquals("black", shape.getColor());
        assertEquals(new Position(2,4), shape.getPosition());
        assertEquals(25, shape.calculateSurface(), .000001);
    }

    @Test
    public void should_create_a_triangle_and_add_this_in_list() {
        Map<String, String> map = Maps.newHashMap();
        map.put(TriangleCommand.BASE, "10");
        map.put(TriangleCommand.HEIGHT, "10");
        Command command = new TriangleCommand("name", map);
        Shape shape = command.execute(shapes);
        assertTrue(shapes.contains(shape));
    }
}
