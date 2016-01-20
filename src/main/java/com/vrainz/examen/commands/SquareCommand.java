package com.vrainz.examen.commands;

import com.vrainz.examen.shapes.Shape;
import com.vrainz.examen.shapes.Square;

import java.util.List;
import java.util.Map;

/**
 * Created by boot on 1/20/16.
 */
public class SquareCommand extends Command {
    public static final String SIDE = "side";

    private final double side;

    public SquareCommand(final String name, final Map<String, String> attributes) {
        super(name, attributes);
        side = Double.parseDouble(attributes.get(SIDE));
    }
    public Shape execute(final List<Shape> shapes) {
        Square square = new Square(name, side, color, position);
        shapes.add(square);
        return square;
    }
}
