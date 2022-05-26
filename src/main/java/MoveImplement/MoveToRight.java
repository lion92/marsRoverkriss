package MoveImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import abstractMove.AbstractMove;

public class MoveToRight implements AbstractMove {


    @Override
    public Rover move(Rover initial) throws PositionNullException, DirectionNullException {
        switch (initial.getDirection()) {
            case North -> {
                return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.West);
            }
            case South -> {
                return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.East);
            }
            case East -> {
                return new Rover(new PointRover(initial.getPointRover().x(), initial.getPointRover().y()), Direction.North);
            }
            case West -> {
                return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.South);
            }


        }
        return initial;

    }
}
