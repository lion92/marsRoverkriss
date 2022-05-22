package MoveImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import abstractMove.AbstractMove;

public class MoveToRight extends AbstractMove {


    @Override
    public Rover moveFrom(Rover initial) throws PositionNullException, DirectionNullException {
        switch (initial.getDirection()) {
            case Norh -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.West);
            }
            case South -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.East);
            }
            case East -> {
                return new Rover(new PointRover(initial.getXi(), initial.getYi()), Direction.Norh);
            }
            case West -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.South);
            }


        }
        return initial;

    }
}
