package com.vrainz.examen.shapes;

import com.google.common.base.MoreObjects;

/**
 * Created by boot on 1/20/16.
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(final String name, final double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(final String name, final double radius, final String color) {
        super(name, color);
        this.radius = radius;
    }

    public Circle(final String name, final double radius, final String color, final Position position) {
        super(name, color, position);
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI*radius*radius;
    }

    @Override
    protected MoreObjects.ToStringHelper addMoreAttributes(MoreObjects.ToStringHelper helper) {
        return helper.add("radius", radius);
    }
}
