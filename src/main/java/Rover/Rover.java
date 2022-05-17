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

    private final String direction;

    public Rover(PointRover pointInitial, String direction) {
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

    public String getDirection() {
        return direction;
    }

    public Rover moveTo(Rover initial, String move) {
        if (initial.direction.equals("" + Direction.S) && move.equals("" + Move.F)
                || initial.direction.equals("" + Direction.E) && move.equals("" + Move.L)
                || initial.direction.equals("" + Direction.W) && move.equals(("" + Move.R))) {
            return new DirectionRoverSouth().moveTo(initial, move);
        } else if (initial.direction.equals("" + Direction.W) && move.equals("" + Move.F)
                || initial.direction.equals("" + Direction.S) && move.equals("" + Move.L)
                || initial.direction.equals("" + Direction.N) && move.equals("" + Move.R)
                || initial.direction.equals("" + Direction.S) && move.equals("" + Move.L)) {
            return new DirectionRoverWest().moveTo(initial, move);
        } else if (initial.direction.equals("" + Direction.E) && move.equals("" + Move.F)
                || initial.direction.equals("" + Direction.S) && move.equals("" + Move.R)) {
            return new DirectionRoverEast().moveTo(initial, move);
        }
        return new DirectionRoverNorth().moveTo(initial, move);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
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

