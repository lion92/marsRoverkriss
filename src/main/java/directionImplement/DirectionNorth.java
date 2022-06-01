package directionImplement;

import listDirectionMove.directionMoveEmum.Direction;
import listDirectionMove.directionMoveEmum.IDirection;
import moveImplement.MoveToBackward;
import moveImplement.MoveToForward;
import moveImplement.MoveToLeft;
import moveImplement.MoveToRight;
import rover.Rover;

public class DirectionNorth implements IDirection {
    private Rover rover;


    public DirectionNorth(Rover rover) {
        this.rover = rover;
    }



    @Override
    public Rover moveForward() {
        return new MoveToForward().moveFromNorth(rover);
    }

    @Override
    public Rover moveBackward() {
        return new MoveToBackward().moveFromNorth(rover);
    }

    @Override
    public Rover turnLeft() {
        return new MoveToLeft().moveFromNorth(rover);
    }

    @Override
    public Rover turnRight() {
        return new MoveToRight().moveFromNorth(rover);
    }
}
