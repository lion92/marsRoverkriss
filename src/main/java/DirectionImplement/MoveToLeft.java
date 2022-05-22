package DirectionImplement;

import DirectionMoveEmum.Direction;
import Rover.*;
import abstractRover.AbstractMove;

public class MoveToLeft extends AbstractMove {



    @Override
    public Rover moveTo(Rover initial) {
        switch (initial.getDirection()) {
            case Norh -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.East);
            }
            case South -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.West);
            }
            case East -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.South);
            }
            case West -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()), Direction.Norh);
            }


        }
        return initial;

    }

}
