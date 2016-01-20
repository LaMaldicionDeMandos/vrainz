package com.vrainz.examen.commands;

import com.vrainz.examen.shapes.*;

import java.util.List;
import java.util.Map;

/**
 * Created by boot on 1/20/16.
 */
public class CircleCommand extends Command {
    public static final String RADIUS = "radius";

    private final double radius;

    public CircleCommand(final String name, final Map<String, String> attributes) {
        super(name, attributes);
        radius = Double.parseDouble(attributes.get(RADIUS));
    }
    public Shape execute(final List<Shape> shapes) {
        Circle circle = new Circle(name, radius, color, position);
        shapes.add(circle);
        return circle;
    }
}
