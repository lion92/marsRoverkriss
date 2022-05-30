package moveImplement;

import listDirectionMove.*;
import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import interfaceMove.InterfaceMove;

import java.util.HashMap;

public class MoveToLeft implements InterfaceMove, MoveByDirection {

    private HashMap<Direction,Rover> listDirectionLeft;


    @Override
    public Rover move(Rover initial)  {
        return getMoveByDirection(initial).get(initial.getDirection());

    }

    @Override
    public Rover moveFromWest(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.North);
    }

    @Override
    public Rover moveFromEast(Rover initial) {
        return  new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.South);
    }

    @Override
    public Rover moveFromSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.West);
    }

    @Override
    public Rover moveFromNorth(Rover initial) {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.East);
    }

    @Override
    public HashMap<Direction, Rover> getMoveByDirection(Rover initial) {
        listDirectionLeft = new HashMap<Direction, Rover>();
        listDirectionLeft.put(Direction.North,new MoveToLeft().moveFromNorth(initial));
        listDirectionLeft.put(Direction.South,new MoveToLeft().moveFromSouth(initial));
        listDirectionLeft.put(Direction.West,new MoveToLeft().moveFromWest(initial));
        listDirectionLeft.put(Direction.East,new MoveToLeft().moveFromEast(initial));

        return listDirectionLeft;
    }
}
