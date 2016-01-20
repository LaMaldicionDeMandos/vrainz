package com.vrainz.examen.commands;

import com.vrainz.examen.shapes.Shape;

import java.util.List;
import java.util.Map;

/**
 * Created by boot on 1/20/16.
 */
public class MoveCommand extends Command {
    public MoveCommand(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public Shape execute(List<Shape> shapes) {
        Shape shape = findByName(name, shapes);
        shape.moveTo(position);
        return shape;
    }

}
