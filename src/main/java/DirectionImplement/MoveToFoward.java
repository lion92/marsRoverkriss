package DirectionImplement;

import Rover.*;
import abstractRover.AbstractMove;

public class MoveToFoward extends AbstractMove {

    @Override
    public Rover moveTo(Rover initial) {

        switch (initial.getDirection()) {
            case N -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()+1), initial.getDirection());
            }
            case S -> {
                return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()-1), initial.getDirection());
            }
            case E -> {
                return new Rover(new PointRover(initial.getXi() -1, initial.getYi()), initial.getDirection());
            }
            case W -> {
                return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()), initial.getDirection());
            }


        }
        return initial;

    }
}
