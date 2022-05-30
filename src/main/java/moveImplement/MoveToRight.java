package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import listDirectionMove.interfaceMove.MoveByDirection;
import rover.*;
import listDirectionMove.interfaceMove.InterfaceMove;

import java.util.HashMap;
import java.util.Map;

public class MoveToRight implements InterfaceMove, MoveByDirection {

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
        Map<Direction, Rover> listDirectionRight = new HashMap<>();
            listDirectionRight.put(Direction.North,moveFromNorth(initial));
            listDirectionRight.put(Direction.South,moveFromSouth(initial));
            listDirectionRight.put(Direction.West,moveFromWest(initial));
            listDirectionRight.put(Direction.East,moveFromEast(initial));

            return (HashMap<Direction, Rover>) listDirectionRight;
    }
}
