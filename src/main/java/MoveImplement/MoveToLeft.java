package MoveImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import InterfaceMove.interfaceMove;

public class MoveToLeft implements interfaceMove {



    @Override
    public Rover move(Rover initial)  {
        switch (initial.getDirection()) {
            case North -> {
                return moveToNorth(initial);
            }
            case South -> {
                return moveToSouth(initial);
            }
            case East -> {
                return moveToEast(initial);
            }
            case West -> {
                return moveToWest(initial);
            }


        }
        return initial;

    }

    @Override
    public Rover moveToWest(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.North);
    }

    @Override
    public Rover moveToEast(Rover initial) {
        return  new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.South);
    }

    @Override
    public Rover moveToSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.West);
    }

    @Override
    public Rover moveToNorth(Rover initial) {
        return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()), Direction.East);
    }

}
