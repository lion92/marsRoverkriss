package DirectionImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import abstractRover.AbstractMove;

public class MoveToRight extends AbstractMove {


    @Override
    public Rover moveTo(Rover initial) {
        switch (initial.getDirection()) {
            case N -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.W);
            }
            case S -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.E);
            }
            case E -> {
                return new Rover(new PointRover(initial.getXi(), initial.getYi()), Direction.N);
            }
            case W -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.S);
            }


        }
        return initial;

    }
}
