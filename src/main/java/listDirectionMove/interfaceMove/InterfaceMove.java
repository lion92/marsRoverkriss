package listDirectionMove.interfaceMove;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;

import java.util.Map;

public interface InterfaceMove {


    Rover move(Rover initial);

    Rover moveFromNorth(Rover initial);
    Rover moveFromSouth(Rover initial);
    Rover moveFromEast(Rover initial);
    Rover moveFromWest(Rover initial);
    Map<Direction, Rover> getMoveByDirection(Rover initial);
}
