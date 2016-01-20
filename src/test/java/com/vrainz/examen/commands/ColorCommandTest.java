package com.vrainz.examen.commands;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.vrainz.examen.shapes.Position;
import com.vrainz.examen.shapes.Shape;
import com.vrainz.examen.shapes.Square;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by boot on 1/20/16.
 */
public class ColorCommandTest {
    private List<Shape> shapes;

    @Before
    public void before() {
        shapes = Lists.newArrayList(new Square("cuadrado", 10));
    }

    @Test
    public void should_set_color_red_to_shape_with_name_cuadrado() {
        Map<String, String> map = Maps.newHashMap();
        map.put("color", "red");
        Command command = new ColorCommand("cuadrado", map);
        Shape shape = command.execute(shapes);
        assertEquals("cuadrado", shape.getName());
        assertEquals("red", shape.getColor());
    }

}
