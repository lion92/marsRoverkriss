package directionImplement;

import listDirectionMove.directionMoveEmum.IDirection;
import moveImplement.MoveToBackward;
import moveImplement.MoveToForward;
import moveImplement.MoveToLeft;
import moveImplement.MoveToRight;
import rover.Rover;

public class DirectionWest implements IDirection {
    private Rover rover;

    public DirectionWest(Rover rover) {
        this.rover = rover;
    }

    @Override
    public Rover moveForward() {
        return new MoveToForward().moveFromWest(rover);
    }

    @Override
    public Rover moveBackward() {
        return new MoveToBackward().moveFromWest(rover);
    }

    @Override
    public Rover turnLeft() {
        return new MoveToLeft().moveFromWest(rover);
    }

    @Override
    public Rover turnRight() {
        return new MoveToRight().moveFromWest(rover);
    }
}
