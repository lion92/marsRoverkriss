package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverNorth extends AbstractMove {

    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals( Direction.E) && move.equals( Move.L)) {
            return new DirectionRoverSouth().moveTo(initial,move);
        } else if (initial.getDirection().equals( Direction.E) && move.equals( Move.R)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi()),  Direction.N);
        } else if (move.equals( Move.F)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() + 1),  initial.getDirection());
        } else if (move.equals( Move.B)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() - 1),  initial.getDirection());
        }
        return initial;
    }
}
