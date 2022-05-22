package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverSouth extends AbstractMove {
    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals( Direction.East) && move.equals( Move.Left)
                || initial.getDirection().equals( Direction.West) && move.equals( Move.Right)
                || initial.getDirection().equals( Direction.East) && move.equals( Move.Left)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi()),  Direction.South);
        } else if (move.equals( Move.Foward)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() - 1), initial.getDirection());
        } else if (move.equals( Move.Backward)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() + 1),  initial.getDirection());
        }
        return initial;
    }
}
