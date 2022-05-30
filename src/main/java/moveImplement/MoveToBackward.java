package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import listDirectionMove.interfaceMove.*;

import java.util.HashMap;

public class MoveToBackward implements InterfaceMove, MoveByDirection {
    private HashMap<Direction,Rover> listDirectionBackward;

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
            case North -> {
                return (initial.getPointRover().positionRoverOrdonne() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverOrdonne() - 1) % 6 - 1 : initial.getPointRover().positionRoverOrdonne() -1;
            }
            case South -> {
                return ((initial.getPointRover().positionRoverOrdonne() + 1) % 6) == 0 ? (initial.getPointRover().positionRoverOrdonne() +1) % 6 + 1 : initial.getPointRover().positionRoverOrdonne() + 1;
            }
            case East -> {
                return (initial.getPointRover().positionRoverAbscisse() + 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() + 1) % 6 + 1 : initial.getPointRover().positionRoverAbscisse() + 1;
            }
            case West -> {
                return (initial.getPointRover().positionRoverAbscisse() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() - 1) % 6 - 1 : initial.getPointRover().positionRoverAbscisse() - 1;
            }


        }
        return 0;
    }


    @Override
    public HashMap<Direction, Rover> getMoveByDirection(Rover initial) {
        listDirectionBackward = new HashMap<Direction, Rover>();
        listDirectionBackward.put(Direction.North,new MoveToBackward().moveFromNorth(initial));
        listDirectionBackward.put(Direction.South,new MoveToBackward().moveFromSouth(initial));
        listDirectionBackward.put(Direction.West,new MoveToBackward().moveFromWest(initial));
        listDirectionBackward.put(Direction.East,new MoveToBackward().moveFromEast(initial));

        return listDirectionBackward;
    }
}
