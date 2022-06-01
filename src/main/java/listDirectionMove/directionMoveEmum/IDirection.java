package listDirectionMove.directionMoveEmum;

import rover.Rover;

public interface IDirection {
     Rover moveForward();
     Rover moveBackward();
     Rover turnLeft();
     Rover turnRight();
}
