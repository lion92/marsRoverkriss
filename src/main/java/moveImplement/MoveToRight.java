package moveImplement;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;
import listDirectionMove.interfaceMove.InterfaceMove;


public class MoveToRight implements InterfaceMove {


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



}
