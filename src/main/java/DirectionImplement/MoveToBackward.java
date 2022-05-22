package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class MoveToBackward extends AbstractMove {

    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals(Direction.E)) {
            return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()), initial.getDirection());
        } else {
            return initial;
        }


    }
}
