package com.vrainz.examen;

import com.google.common.collect.Lists;
import com.vrainz.examen.commands.CommandFactory;
import com.vrainz.examen.shapes.Shape;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by boot on 1/20/16.
 */
public class Main {
    public static void main(final String[] args) {
        String path = args[0];
        List<Shape> shapes = Lists.newArrayList();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(line -> {
                String[] commandString = line.split(" ");
                CommandFactory.createCommand(commandString).execute(shapes);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        shapes.forEach(Shape::print);
    }
}
