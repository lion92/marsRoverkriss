package interfaceMove;

import rover.*;

public interface interfaceMove {


    Rover move(Rover initial);

    Rover moveToNorth(Rover initial);
    Rover moveToSouth(Rover initial);
    Rover moveToEast(Rover initial);
    Rover moveToWest(Rover initial);
}
