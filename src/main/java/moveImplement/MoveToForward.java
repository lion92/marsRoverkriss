package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import listDirectionMove.interfaceMove.InterfaceMove;


public class MoveToForward implements InterfaceMove {



    @Override
    public Rover moveFromWest(Rover initial) {
        return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().positionRoverOrdonne()), initial.getDirection());
    }

    @Override
    public Rover moveFromEast(Rover initial)  {
        return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().positionRoverOrdonne()), initial.getDirection());
    }

    @Override
    public Rover moveFromSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse(), calculPositionAfterMoving(initial)), initial.getDirection());
    }

    @Override
    public Rover moveFromNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse(), calculPositionAfterMoving(initial)), initial.getDirection());
    }

    private int calculPositionAfterMoving(Rover initial) {
        switch (initial.getDirection()) {
            case NORTH -> {
                return (initial.getPointRover().positionRoverOrdonne() + 1) % 6 == 0 ? (initial.getPointRover().positionRoverOrdonne() + 1) % 6 + 1 : initial.getPointRover().positionRoverOrdonne() + 1;
            }
            case SOUTH -> {
                return ((initial.getPointRover().positionRoverOrdonne() - 1) % 6) == 0 ? (initial.getPointRover().positionRoverOrdonne() - 1) % 6 - 1 : initial.getPointRover().positionRoverOrdonne() - 1;
            }
            case EAST -> {
                return (initial.getPointRover().positionRoverAbscisse() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() - 1) % 6 - 1 : initial.getPointRover().positionRoverAbscisse() - 1;
            }
            case WEST -> {
                return (initial.getPointRover().positionRoverAbscisse() + 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() + 1) % 6 + 1 : initial.getPointRover().positionRoverAbscisse() + 1;
            }


        }
        return 0;
    }


}
