package directionImplement;

import listDirectionMove.directionMoveEmum.IDirection;
import moveImplement.MoveToBackward;
import moveImplement.MoveToForward;
import moveImplement.MoveToLeft;
import moveImplement.MoveToRight;
import rover.Rover;

public class DirectionEast implements IDirection {
    private Rover rover;

    public DirectionEast(Rover rover) {
        this.rover = rover;
    }

    @Override
    public Rover moveForward() {
        return new MoveToForward().moveFromEast(rover);
    }

    @Override
    public Rover moveBackward() {
        return new MoveToBackward().moveFromEast(rover);
    }

    @Override
    public Rover turnLeft() {
        return new MoveToLeft().moveFromEast(rover);
    }

    @Override
    public Rover turnRight() {
        return new MoveToRight().moveFromEast(rover);
    }
}
