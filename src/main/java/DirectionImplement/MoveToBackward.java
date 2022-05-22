package DirectionImplement;

import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import abstractRover.AbstractMove;

public class MoveToBackward extends AbstractMove {



    @Override
    public Rover moveFrom(Rover initial) throws PositionNullException, DirectionNullException {

        switch (initial.getDirection()) {
            case Norh -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()-1), initial.getDirection());
            }
            case South -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()+1), initial.getDirection());
            }
            case East -> {
                return new Rover(new PointRover(initial.getXi() +1, initial.getYi()), initial.getDirection());
            }
            case West -> {
                return new Rover(new PointRover(initial.getXi() -1, initial.getYi()), initial.getDirection());
            }


        }
        return initial;

    }


}
