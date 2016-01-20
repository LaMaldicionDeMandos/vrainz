package com.vrainz.examen.shapes;

import com.google.common.base.MoreObjects;

/**
 * Created by boot on 1/20/16.
 */
public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(final String name, final double base, final double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public Triangle(final String name, final double base, final double height, final String color) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public Triangle(final String name, final double base, final double height, final String color, final Position position) {
        super(name, color, position);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateSurface() {
        return base*height/2;
    }

    @Override
    protected MoreObjects.ToStringHelper addMoreAttributes(MoreObjects.ToStringHelper helper) {
        return helper.add("base", base).add("height", height);
    }
}
