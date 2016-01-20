package com.vrainz.examen.shapes;

import com.google.common.base.MoreObjects;

/**
 * Created by boot on 1/20/16.
 */
public class Square extends Shape {
    private final double side;

    public Square(final String name, final double side) {
        super(name);
        this.side = side;
    }

    public Square(final String name, final double side, final String color) {
        super(name, color);
        this.side = side;
    }

    public Square(final String name, final double side, final String color, final Position position) {
        super(name, color, position);
        this.side = side;
    }

    @Override
    public double calculateSurface() {
        return side*side;
    }

    @Override
    protected MoreObjects.ToStringHelper addMoreAttributes(MoreObjects.ToStringHelper helper) {
        return helper.add("side", side);
    }
}
