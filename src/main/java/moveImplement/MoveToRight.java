package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import listDirectionMove.interfaceMove.InterfaceMove;

import java.util.HashMap;

public class MoveToRight implements InterfaceMove {

    @Override
    public Rover move(Rover initial)  {
       return getMoveByDirection(initial).get(initial.getDirection());

    }

    @Override
    public Rover moveFromWest(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.SOUTH);
    }

    @Override
    public Rover moveFromEast(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse(), initial.getPointRover().positionRoverOrdonne()), Direction.NORTH);
    }

    @Override
    public Rover moveFromSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.EAST);
    }

    @Override
    public Rover moveFromNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.WEST);
    }

    @Override
    public HashMap<Direction, Rover> getMoveByDirection(Rover initial) {
        HashMap<Direction, Rover> listDirectionRight = new HashMap<>();
            listDirectionRight.put(Direction.NORTH,moveFromNorth(initial));
            listDirectionRight.put(Direction.SOUTH,moveFromSouth(initial));
            listDirectionRight.put(Direction.WEST,moveFromWest(initial));
            listDirectionRight.put(Direction.EAST,moveFromEast(initial));

            return listDirectionRight;
    }
}
