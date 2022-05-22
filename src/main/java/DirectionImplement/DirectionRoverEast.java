package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverEast extends AbstractMove {
    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals( Direction.South) && move.equals(Move.Left)) {
            return new DirectionRoverWest().moveTo(initial,move);
        } else if (initial.getDirection().equals( Direction.South) && move.equals( Move.Right)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi()), Direction.East);
        } else if (move.equals( Move.Foward)) {
            return new Rover(new PointRover(initial.getXi() - 1, initial.getYi()),  initial.getDirection());
        } else if (move.equals(Move.Backward)) {
            return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()), initial.getDirection());
        } else {
            return initial;
        }
    }
}
