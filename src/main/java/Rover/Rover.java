package Rover;

import MoveImplement.*;
import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

import java.util.Objects;

public class Rover {
    private final int xi;
    private final int yi;

    private final Direction direction;

    public Rover(PointRover pointInitial, Direction direction) throws PositionNullException, DirectionNullException {
        if(pointInitial==null){
            throw new PositionNullException("Position Null");
        }
        if(direction==null){
            throw new DirectionNullException("Direction null");
        }
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

    public Rover moveTo(Move move) throws PositionNullException, DirectionNullException {

       switch (move){
           case Foward -> {
               return new MoveToFoward().moveFrom(this);
           }
           case Backward -> {
               return new MoveToBackward().moveFrom(this);
           }
           case Left -> {
               return new MoveToLeft().moveFrom(this);
           }
           case Right -> {
               return new MoveToRight().moveFrom(this);
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

