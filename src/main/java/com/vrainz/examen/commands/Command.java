package com.vrainz.examen.commands;

import com.vrainz.examen.shapes.Position;
import com.vrainz.examen.shapes.Shape;

import java.util.List;
import java.util.Map;

import static com.google.common.collect.Iterables.tryFind;

/**
 * Created by boot on 1/20/16.
 */
public abstract class Command {
    public static final String COLOR = "color";
    public static final String X = "x";
    public static final String Y = "y";

    protected final String name;
    protected final String color;
    protected final Position position;

    public Command(final String name, final Map<String, String> attributes) {
        this.name = name;
        color = attributes.containsKey(COLOR) ? attributes.get(COLOR) : "black";
        int x = attributes.containsKey(X) ? Integer.parseInt(attributes.get(X)) : 0;
        int y = attributes.containsKey(Y) ? Integer.parseInt(attributes.get(Y)) : 0;
        position = new Position(x, y);
    }

    public abstract Shape execute(List<Shape> shapes);
    public Shape findByName(final String name, final List<Shape> shapes) {
        return tryFind(shapes, shape -> name.equals(shape.getName())).orNull();
    }
}
