package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverSouth extends AbstractMove {
    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals( Direction.E) && move.equals( Move.L)
                || initial.getDirection().equals( Direction.W) && move.equals( Move.R)
                || initial.getDirection().equals( Direction.E) && move.equals( Move.L)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi()),  Direction.S);
        } else if (move.equals( Move.F)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() - 1), initial.getDirection());
        } else if (move.equals( Move.B)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() + 1),  initial.getDirection());
        }
        return initial;
    }
}
