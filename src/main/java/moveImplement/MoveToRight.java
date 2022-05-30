package moveImplement;

import listDirectionMove.*;
import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import interfaceMove.InterfaceMove;

import java.util.HashMap;

public class MoveToRight implements InterfaceMove, MoveByDirection {
    private HashMap<Direction, Rover> listDirectionRight;

    @Override
    public Rover move(Rover initial)  {
       return getMoveByDirection(initial).get(initial.getDirection());

    }

    @Override
    public Rover moveFromWest(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.South);
    }

    @Override
    public Rover moveFromEast(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse(), initial.getPointRover().positionRoverOrdonne()), Direction.North);
    }

    @Override
    public Rover moveFromSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.East);
    }

    @Override
    public Rover moveFromNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.West);
    }

    @Override
    public HashMap<Direction, Rover> getMoveByDirection(Rover initial) {
            listDirectionRight = new HashMap<Direction, Rover>();
            listDirectionRight.put(Direction.North,new MoveToRight().moveFromNorth(initial));
            listDirectionRight.put(Direction.South,new MoveToRight().moveFromSouth(initial));
            listDirectionRight.put(Direction.West,new MoveToRight().moveFromWest(initial));
            listDirectionRight.put(Direction.East,new MoveToRight().moveFromEast(initial));

            return listDirectionRight;
    }
}
