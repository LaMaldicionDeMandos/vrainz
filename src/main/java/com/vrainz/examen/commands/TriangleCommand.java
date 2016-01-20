package com.vrainz.examen.commands;

import com.vrainz.examen.shapes.Shape;
import com.vrainz.examen.shapes.Triangle;

import java.util.List;
import java.util.Map;

/**
 * Created by boot on 1/20/16.
 */
public class TriangleCommand extends Command {
    public static final String BASE = "base";
    public static final String HEIGHT = "height";

    private final double base;
    private final double height;

    public TriangleCommand(final String name, final Map<String, String> attributes) {
        super(name, attributes);
        base = Double.parseDouble(attributes.get(BASE));
        height = Double.parseDouble(attributes.get(HEIGHT));
    }
    public Shape execute(final List<Shape> shapes) {
        Triangle triangle = new Triangle(name, base, height, color, position);
        shapes.add(triangle);
        return triangle;
    }

}
