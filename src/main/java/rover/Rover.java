package rover;

import listDirectionMove.directionMoveEmum.Direction;
import listDirectionMove.directionMoveEmum.Move;
import moveImplement.MoveToBackward;
import moveImplement.MoveToForward;
import moveImplement.MoveToLeft;
import moveImplement.MoveToRight;
import rover.Exception.DirectionNullException;
import rover.Exception.PositionNullException;

import java.util.HashMap;
import java.util.Objects;

public class Rover {

    private HashMap<Move,Rover> listMove;
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

        return move.getInterfaceMove().move(this);

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

