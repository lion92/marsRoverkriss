package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverWest extends AbstractMove {
    @Override
    public Rover moveTo(Rover roverInitital, Move move) {
        if (roverInitital.getDirection().equals( Direction.S) && move.equals(Move.L)
                || roverInitital.getDirection().equals( Direction.N) && move.equals( Move.R)
                ||roverInitital.getDirection().equals( Direction.S) && move.equals( Move.L)) {
            return new Rover(new PointRover(roverInitital.getXi(), roverInitital.getYi()),  Direction.W);
        } else if (move.equals( Move.F)) {
            return new Rover(new PointRover(roverInitital.getXi() + 1, roverInitital.getYi()), roverInitital.getDirection());
        } else if (move.equals( Move.B)) {
            return new Rover(new PointRover(roverInitital.getXi() - 1, roverInitital.getYi()), roverInitital.getDirection());
        }
        return roverInitital;
    }
}
