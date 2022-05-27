package moveImplement;

import directionMoveEmum.Direction;
import rover.*;
import interfaceMove.interfaceMove;

public class MoveToLeft implements interfaceMove {



    @Override
    public Rover move(Rover initial)  {
        switch (initial.getDirection()) {
            case North -> {
                return moveToNorth(initial);
            }
            case South -> {
                return moveToSouth(initial);
            }
            case East -> {
                return moveToEast(initial);
            }
            case West -> {
                return moveToWest(initial);
            }


        }
        return initial;

    }

    @Override
    public Rover moveToWest(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.North);
    }

    @Override
    public Rover moveToEast(Rover initial) {
        return  new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.South);
    }

    @Override
    public Rover moveToSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.West);
    }

    @Override
    public Rover moveToNorth(Rover initial) {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , initial.getPointRover().positionRoverOrdonne()), Direction.East);
    }

}
