package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import listDirectionMove.interfaceMove.*;

import java.util.HashMap;
import java.util.Map;

public class MoveToBackward implements InterfaceMove {

    @Override
    public Rover move(Rover initial) {

            return getMoveByDirection(initial).get(initial.getDirection());

    }

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
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , calculPositionAfterMoving(initial)), initial.getDirection());
    }

    @Override
    public Rover moveFromNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , calculPositionAfterMoving(initial)), initial.getDirection());
    }

    private int calculPositionAfterMoving(Rover initial) {
        switch (initial.getDirection()) {
            case NORTH -> {
                return (initial.getPointRover().positionRoverOrdonne() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverOrdonne() - 1) % 6 - 1 : initial.getPointRover().positionRoverOrdonne() -1;
            }
            case SOUTH -> {
                return ((initial.getPointRover().positionRoverOrdonne() + 1) % 6) == 0 ? (initial.getPointRover().positionRoverOrdonne() +1) % 6 + 1 : initial.getPointRover().positionRoverOrdonne() + 1;
            }
            case EAST -> {
                return (initial.getPointRover().positionRoverAbscisse() + 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() + 1) % 6 + 1 : initial.getPointRover().positionRoverAbscisse() + 1;
            }
            case WEST -> {
                return (initial.getPointRover().positionRoverAbscisse() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() - 1) % 6 - 1 : initial.getPointRover().positionRoverAbscisse() - 1;
            }


        }
        return 0;
    }


    @Override
    public HashMap<Direction, Rover> getMoveByDirection(Rover initial) {
        Map<Direction, Rover> listDirectionBackward = new HashMap<>();
        listDirectionBackward.put(Direction.NORTH,moveFromNorth(initial));
        listDirectionBackward.put(Direction.SOUTH,moveFromSouth(initial));
        listDirectionBackward.put(Direction.WEST,moveFromWest(initial));
        listDirectionBackward.put(Direction.EAST,moveFromEast(initial));

        return (HashMap<Direction, Rover>) listDirectionBackward;
    }
}
