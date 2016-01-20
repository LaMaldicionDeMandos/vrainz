package com.vrainz.examen.commands;

import com.google.common.collect.Lists;
import com.vrainz.examen.shapes.Shape;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by boot on 1/20/16.
 */
public class CommandFactoryTest {
    private final static List<Shape> shapes = Lists.newArrayList();

    @Test
    public void should_create_a_square_command_that_create_a_square_with_name_and_side() {
        Command command = CommandFactory.createCommand(new String[]{"square", "name", "side:10"});
        assertTrue(command instanceof SquareCommand);
        Shape shape = command.execute(shapes);
        Assert.assertEquals("name", shape.getName());
        Assert.assertEquals(100, shape.calculateSurface(), .00001);
    }

    @Test
    public void should_create_a_square_command_that_create_a_square_with_name_and_color_red() {
        Command command = CommandFactory.createCommand(new String[]{"square", "name", "side:10", "color:red"});
        assertTrue(command instanceof SquareCommand);
        Shape shape = command.execute(shapes);
        Assert.assertEquals("name", shape.getName());
        Assert.assertEquals("red", shape.getColor());
    }

    @Test
    public void should_create_a_triangle_command_that_create_a_triangle_with_name_base_and_height() {
        Command command = CommandFactory.createCommand(new String[]{"triangle", "name", "base:10", "height:5"});
        assertTrue(command instanceof TriangleCommand);
        Shape shape = command.execute(shapes);
        Assert.assertEquals("name", shape.getName());
        Assert.assertEquals(25, shape.calculateSurface(), .00001);
    }

    @Test
    public void should_create_a_circle_command_that_create_a_circle_with_name_radius() {
        Command command = CommandFactory.createCommand(new String[]{"circle", "name", "radius:10"});
        assertTrue(command instanceof CircleCommand);
        Shape shape = command.execute(shapes);
        Assert.assertEquals("name", shape.getName());
        Assert.assertEquals(314.16, shape.calculateSurface(), .1);
    }

    @Test
    public void should_create_a_move_command() {
        Command command = CommandFactory.createCommand(new String[]{"move", "name", "x:8"});
        assertTrue(command instanceof MoveCommand);
    }
}
