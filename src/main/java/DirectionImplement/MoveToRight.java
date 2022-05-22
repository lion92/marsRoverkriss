package DirectionImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import abstractRover.AbstractMove;

public class MoveToRight extends AbstractMove {

    @Override
    public Rover moveTo(Rover initial) {
        switch (initial.getDirection()) {
            case N -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()+1), Direction.W);
            }
            case S -> {
                return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()-1), Direction.E);
            }
            case E -> {
                return new Rover(new PointRover(initial.getXi() -1, initial.getYi()), Direction.N);
            }
            case W -> {
                return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()), Direction.S);
            }


        }
        return initial;

    }
}
