package DirectionImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import abstractRover.AbstractMove;

public class MoveToLeft extends AbstractMove {



    @Override
    public Rover moveTo(Rover initial) {
        switch (initial.getDirection()) {
            case N -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.E);
            }
            case S -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.W);
            }
            case E -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.S);
            }
            case W -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.N);
            }


        }
        return initial;

    }

}
