package rover;

import moveImplement.*;
import directionMoveEmum.Direction;
import directionMoveEmum.Move;
import rover.Exception.DirectionNullException;
import rover.Exception.PositionNullException;

import java.util.Objects;

public class Rover {


    private final Direction direction;
    private final PointRover pointRover;

    public Rover(
            PointRover pointRover, Direction direction) {

        this.pointRover = pointRover;
        this.direction = direction;

    }
    public static Rover build(PointRover pointRover, Direction direction) throws DirectionNullException, PositionNullException {
        if(pointRover==null){
            throw new PositionNullException("Position Null");
        }
        if(direction==null){
            throw new DirectionNullException("Direction null");
        }
        return new Rover(pointRover,direction);
    }


    public PointRover getPointRover() {
        return pointRover;
    }

    public Direction getDirection() {
        return direction;
    }

    public Rover moveTo(Move move) {

       switch (move){
           case Foward -> {
               return new MoveToForward().move(this);
           }
           case Backward -> {
               return new MoveToBackward().move(this);
           }
           case Left -> {
               return new MoveToLeft().move(this);
           }
           case Right -> {
               return new MoveToRight().move(this);
           }
       }

        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return direction == rover.direction && Objects.equals(pointRover, rover.pointRover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, pointRover);
    }

    @Override
    public String toString() {
        return "" + this.pointRover.positionRoverAbscisse() + " x " + this.pointRover.positionRoverOrdonne()+ " y " + this.direction + " direction ";
    }
}

