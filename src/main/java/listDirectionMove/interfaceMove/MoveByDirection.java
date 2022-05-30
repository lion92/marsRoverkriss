package listDirectionMove.interfaceMove;

import listDirectionMove.directionMoveEmum.Direction;
import rover.Rover;

import java.util.HashMap;

public interface MoveByDirection {
    HashMap<Direction, Rover> getMoveByDirection(Rover initial);
}
