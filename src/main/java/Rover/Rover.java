package Rover;

import DirectionImplement.*;
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

       switch (move){
           case F -> {
               return new MoveToFoward().moveTo(this);
           }
           case B -> {
               return new MoveToBackward().moveTo(this);
           }
           case L -> {
               return new MoveToLeft().moveTo(this);
           }
           case R -> {
               return new MoveToRight().moveTo(this);
           }
       }
       
        return null;
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

