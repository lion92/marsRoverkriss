package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverNorth extends AbstractMove {

    @Override
    public Rover moveTo(Rover initial, Move move) {
        if (initial.getDirection().equals( Direction.East) && move.equals( Move.Left)) {
            return new DirectionRoverSouth().moveTo(initial,move);
        } else if (initial.getDirection().equals( Direction.East) && move.equals( Move.Right)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi()),  Direction.Norh);
        } else if (move.equals( Move.Foward)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() + 1),  initial.getDirection());
        } else if (move.equals( Move.Backward)) {
            return new Rover(new PointRover(initial.getXi(), initial.getYi() - 1),  initial.getDirection());
        }
        return initial;
    }
}
