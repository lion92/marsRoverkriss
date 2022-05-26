package MoveImplement;

import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;
import abstractMove.AbstractMove;

public class MoveToForward implements AbstractMove {


    @Override
    public Rover move(Rover initial) {

        switch (initial.getDirection()) {
            case North, South -> {
                return new Rover(new PointRover(initial.getPointRover().x(), calculPositionAfterMoving(initial)), initial.getDirection());
            }
            case East, West -> {
                return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().y()), initial.getDirection());
            }


        }
        return initial;

    }

    private int calculPositionAfterMoving(Rover initial) {
        switch (initial.getDirection()) {
            case North -> {
                return (initial.getPointRover().y() + 1) % 6 == 0 ? (initial.getPointRover().y() + 1) % 6 + 1 : initial.getPointRover().y() + 1;
            }
            case South -> {
                return ((initial.getPointRover().y() - 1) % 6) == 0 ? (initial.getPointRover().y() - 1) % 6 - 1 : initial.getPointRover().y() - 1;
            }
            case East -> {
                return (initial.getPointRover().x() - 1) % 6 == 0 ? (initial.getPointRover().x() - 1) % 6 - 1 : initial.getPointRover().x() - 1;
            }
            case West -> {
                return (initial.getPointRover().x() + 1) % 6 == 0 ? (initial.getPointRover().x() + 1) % 6 + 1 : initial.getPointRover().x() + 1;
            }


        }
        return 0;
    }
}
