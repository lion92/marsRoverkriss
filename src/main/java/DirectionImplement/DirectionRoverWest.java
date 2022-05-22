package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractMove;

public class DirectionRoverWest extends AbstractMove {
    @Override
    public Rover moveTo(Rover roverInitital, Move move) {
        if (roverInitital.getDirection().equals( Direction.South) && move.equals(Move.Left)
                || roverInitital.getDirection().equals( Direction.Norh) && move.equals( Move.Right)
                ||roverInitital.getDirection().equals( Direction.South) && move.equals( Move.Left)) {
            return new Rover(new PointRover(roverInitital.getXi(), roverInitital.getYi()),  Direction.West);
        } else if (move.equals( Move.Foward)) {
            return new Rover(new PointRover(roverInitital.getXi() + 1, roverInitital.getYi()), roverInitital.getDirection());
        } else if (move.equals( Move.Backward)) {
            return new Rover(new PointRover(roverInitital.getXi() - 1, roverInitital.getYi()), roverInitital.getDirection());
        }
        return roverInitital;
    }
}
