package Rover;

import DirectionImplement.DirectionRoverEast;
import DirectionImplement.DirectionRoverNorth;
import DirectionImplement.DirectionRoverSouth;
import DirectionImplement.DirectionRoverWest;
import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;

import java.util.Objects;

public class Rover {
    private final int xi;
    private final int yi;

    private final Direction direction;

    public Rover(PointRover pointInitial, Direction direction) {
        this.xi = pointInitial.x();
        this.yi = pointInitial.y();
        this.direction = direction;

    }

    public int getXi() {
        return xi;
    }

    public int getYi() {
        return yi;
    }

    public Direction getDirection() {
        return direction;
    }

    public Rover moveTo(Move move) {
        if (this.direction.equals( Direction.S) && move.equals(Move.F)
                || this.direction.equals( Direction.E) && move.equals( Move.L)
                || this.direction.equals(Direction.W) && move.equals( Move.R)) {
            return new DirectionRoverSouth().moveTo(this, move);
        } else if (this.direction.equals(Direction.W) && move.equals( Move.F)
                || this.direction.equals( Direction.S) && move.equals( Move.L)
                || this.direction.equals( Direction.N) && move.equals(Move.R)
                || this.direction.equals( Direction.S) && move.equals( Move.L)) {
            return new DirectionRoverWest().moveTo(this, move);
        } else if (this.direction.equals(Direction.E) && move.equals( Move.F)
                || this.direction.equals( Direction.S) && move.equals( Move.R)) {
            return new DirectionRoverEast().moveTo(this, move);
        }
        return new DirectionRoverNorth().moveTo(this, move);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover rover)) return false;
        return xi == rover.xi && yi == rover.yi && Objects.equals(direction, rover.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xi, yi, direction);
    }

    @Override
    public String toString() {
        return "" + this.xi + " x " + this.yi + " y " + this.direction + " direction ";
    }
}

