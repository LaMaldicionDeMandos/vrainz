package com.vrainz.examen.shapes;

import com.google.common.base.MoreObjects;

/**
 * Created by boot on 1/19/16.
 */
public abstract class Shape {
    private final String name;
    private String color;
    private Position position;

    public Shape(final String name) {
        this(name, "black");
    }

    public Shape(final String name, final String color) {
        this(name, color, new Position());
    }

    public Shape(final String name, final String color, final Position position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public final void print() {
        System.out.println(this);
    }

    public Position getPosition() {
        return position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public final void moveTo(final Position position) {
        this.position = position;
    }

    public final void moveTo(final int x, final int y) {
        moveTo(new Position(x, y));
    }

    public abstract double calculateSurface();

    protected abstract MoreObjects.ToStringHelper addMoreAttributes(MoreObjects.ToStringHelper helper);

    @Override
    public String toString() {
        MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(this.getClass())
                .add("name", name)
                .add("color", color)
                .add("position", position)
                .add("surface", calculateSurface());
        return addMoreAttributes(helper).toString();
    }
}
