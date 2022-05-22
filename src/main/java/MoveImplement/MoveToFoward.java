package MoveImplement;

import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import abstractMove.AbstractMove;

public class MoveToFoward extends AbstractMove {


    @Override
    public Rover moveFrom(Rover initial) throws PositionNullException, DirectionNullException {

        switch (initial.getDirection()) {
            case Norh, South -> {
                return new Rover(new PointRover(initial.getXi(), calculPositionAfterMoving(initial)), initial.getDirection());
            }
            case East, West -> {
                return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getYi()), initial.getDirection());
            }


        }
        return initial;

    }

    private int calculPositionAfterMoving(Rover initial) {
        switch (initial.getDirection()) {
            case Norh -> {
                return (initial.getYi() + 1) % 6 == 0 ? (initial.getYi() + 1) % 6 + 1 : initial.getYi() + 1;
            }
            case South -> {
                return ((initial.getYi() - 1) % 6) == 0 ? (initial.getYi() - 1) % 6 - 1 : initial.getYi() - 1;
            }
            case East -> {
                return (initial.getXi() - 1) % 6 == 0 ? (initial.getXi() - 1) % 6 - 1 : initial.getXi() - 1;
            }
            case West -> {
                return (initial.getXi() + 1) % 6 == 0 ? (initial.getXi() + 1) % 6 + 1 : initial.getXi() + 1;
            }


        }
        return 0;
    }
}
