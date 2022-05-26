package MoveImplement;

import Rover.*;
import InterfaceMove.interfaceMove;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

public class MoveToForward implements interfaceMove {


    @Override
    public Rover move(Rover initial) {

        switch (initial.getDirection()) {
            case North, South -> {
                return moveToNorth(initial);
            }
            case East, West -> {
                return moveToEast(initial);
            }


        }
        return initial;

    }

    @Override
    public Rover moveToWest(Rover initial) {
        return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().y()), initial.getDirection());
    }

    @Override
    public Rover moveToEast(Rover initial)  {
        return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().y()), initial.getDirection());
    }

    @Override
    public Rover moveToSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x(), calculPositionAfterMoving(initial)), initial.getDirection());
    }

    @Override
    public Rover moveToNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().x(), calculPositionAfterMoving(initial)), initial.getDirection());
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
