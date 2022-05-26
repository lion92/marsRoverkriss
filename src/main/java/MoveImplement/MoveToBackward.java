package MoveImplement;

import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import abstractMove.AbstractMove;

public class MoveToBackward implements AbstractMove {



    @Override
    public Rover move(Rover initial) throws PositionNullException, DirectionNullException {

        switch (initial.getDirection()) {
            case North -> {
                return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()-1), initial.getDirection());
            }
            case South -> {
                return new Rover(new PointRover(initial.getPointRover().x() , initial.getPointRover().y()+1), initial.getDirection());
            }
            case East -> {
                return new Rover(new PointRover(initial.getPointRover().x() +1, initial.getPointRover().y()), initial.getDirection());
            }
            case West -> {
                return new Rover(new PointRover(initial.getPointRover().x() -1, initial.getPointRover().y()), initial.getDirection());
            }


        }
        return initial;

    }


}
