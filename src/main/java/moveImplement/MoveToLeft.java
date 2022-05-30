package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import listDirectionMove.interfaceMove.InterfaceMove;

import java.util.HashMap;
import java.util.Map;

public class MoveToLeft implements InterfaceMove {


    @Override
    public Rover move(Rover initial)  {
        return getMoveByDirection(initial).get(initial.getDirection());

    }

    @Override
    public Rover moveFromWest(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.NORTH);
    }

    @Override
    public Rover moveFromEast(Rover initial) {
        return  new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.SOUTH);
    }

    @Override
    public Rover moveFromSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.WEST);
    }

    @Override
    public Rover moveFromNorth(Rover initial) {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.EAST);
    }

    @Override
    public HashMap<Direction, Rover> getMoveByDirection(Rover initial) {
        Map<Direction, Rover> listDirectionLeft = new HashMap<>();
        listDirectionLeft.put(Direction.NORTH,moveFromNorth(initial));
        listDirectionLeft.put(Direction.SOUTH,moveFromSouth(initial));
        listDirectionLeft.put(Direction.WEST,moveFromWest(initial));
        listDirectionLeft.put(Direction.EAST,moveFromEast(initial));

        return (HashMap<Direction, Rover>) listDirectionLeft;
    }
}
