package com.vrainz.examen.shapes;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Created by boot on 1/19/16.
 */
public class Position {
    private final int x;
    private final  int y;

    public Position() {
        this(0, 0);
    }

    public Position(final int x, final int y) {
        checkArgument(x >= 0 && x <= 9);
        checkArgument(y >= 0 && y <= 9);

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position p = (Position)o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x, y);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(Position.class)
                .add("x", x)
                .add("y", y).toString();
    }
}
