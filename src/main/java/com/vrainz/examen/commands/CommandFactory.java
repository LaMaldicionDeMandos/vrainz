package com.vrainz.examen.commands;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by boot on 1/20/16.
 */
public class CommandFactory {
    private interface FactoryCommand {
        Command createCommand(String name, Map<String, String> attributes);
    }

    private final static Map<String, FactoryCommand> factories = Maps.newHashMap();

    static {
        factories.put("square", (name, attributes) -> new SquareCommand(name, attributes));
        factories.put("triangle", (name, attributes) -> new TriangleCommand(name, attributes));
        factories.put("circle", (name, attributes) -> new CircleCommand(name, attributes));
        factories.put("move", (name, attributes) -> new MoveCommand(name, attributes));
        factories.put("color", (name, attributes) -> new ColorCommand(name, attributes));
    }

    public static Command createCommand(final String[] attrs) {
        String command = attrs[0];
        String name = attrs[1];
        Map<String, String> attributes = mapAttributes(attrs);
        return factories.get(command).createCommand(name, attributes);
    }

    private static Map<String, String> mapAttributes(String[] attrs) {
        Map<String, String> map = Maps.newHashMap();
        for(int i = 2; i < attrs.length;i++) {
            String[] pair = attrs[i].split(":");
            map.put(pair[0], pair[1]);
        }
        return map;
    }
}
