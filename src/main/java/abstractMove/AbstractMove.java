package abstractMove;

import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

public interface AbstractMove {


    Rover move(Rover initial) throws PositionNullException, DirectionNullException;
}
