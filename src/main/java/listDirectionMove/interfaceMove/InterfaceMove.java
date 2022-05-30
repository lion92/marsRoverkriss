package listDirectionMove.interfaceMove;

import rover.*;

public interface InterfaceMove {


    Rover move(Rover initial);

    Rover moveFromNorth(Rover initial);
    Rover moveFromSouth(Rover initial);
    Rover moveFromEast(Rover initial);
    Rover moveFromWest(Rover initial);
}
