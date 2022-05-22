package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverEast extends AbstractMove {
    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals( Direction.S) && move.equals(Move.L)) {
            return new DirectionRoverWest().moveTo(initial,move);
        } else if (initial.getDirection().equals( Direction.S) && move.equals( Move.R)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi()), Direction.E);
        } else if (move.equals( Move.F)) {
            return new Rover(new PointRover(initial.getXi() - 1, initial.getYi()),  initial.getDirection());
        } else if (move.equals(Move.B)) {
            return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()), initial.getDirection());
        } else {
            return initial;
        }
    }
}
