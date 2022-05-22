package DirectionImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import abstractRover.AbstractMove;

public class MoveToRight extends AbstractMove {


    @Override
    public Rover moveTo(Rover initial) {
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
