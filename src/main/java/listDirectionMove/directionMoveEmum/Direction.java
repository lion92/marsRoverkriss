package listDirectionMove.directionMoveEmum;

import rover.PointRover;

public enum Direction {
    NORTH(), SOUTH(), WEST(), EAST();

    Direction() {
    }
}

interface IDirection {
    Direction turnLeft();
    Direction turnRight();
    PointRover moveForward(PointRover point);
    PointRover moveBackward(PointRover point);
}

class DirectionNorth implements IDirection {
    @Override
    public Direction turnLeft() {
        return WEST;
    }

    @Override
    public Direction turnRight() {
        return null;
    }

    @Override
    public PointRover moveForward(PointRover point) {
        return null;
    }

    @Override
    public PointRover moveBackward(PointRover point) {
        return null;
    }
}
