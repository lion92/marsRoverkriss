package moveImplement;

import listDirectionMove.ListDirectionMove;
import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import interfaceMove.InterfaceMove;

public class MoveToLeft implements InterfaceMove {



    @Override
    public Rover move(Rover initial)  {
        return new ListDirectionMove().getlistDirectionLeft(initial).get(initial.getDirection());

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

}
