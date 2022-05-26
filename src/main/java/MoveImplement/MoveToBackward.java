package MoveImplement;

import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import InterfaceMove.interfaceMove;

public class MoveToBackward implements interfaceMove {



    @Override
    public Rover move(Rover initial) {

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
    public Rover moveToWest(Rover initial) {
        return new Rover(new PointRover(initial.getPointRover().x() -1, initial.getPointRover().y()), initial.getDirection());
    }

    @Override
    public Rover moveToEast(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x() +1, initial.getPointRover().y()), initial.getDirection());
    }

    @Override
    public Rover moveToSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()+1), initial.getDirection());
    }

    @Override
    public Rover moveToNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()-1), initial.getDirection());
    }


}
