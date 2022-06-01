package listDirectionMove.interfaceMove;

import listDirectionMove.directionMoveEmum.Direction;
import rover.*;

import java.util.HashMap;
import java.util.Map;

public interface InterfaceMove {
    default Rover move(Rover initial){
        return getMoveByDirection(initial).get(initial.getDirection());
    };
    default Map<Direction, Rover> getMoveByDirection(Rover initial){
            Map<Direction, Rover> listDirectionRight = new HashMap<>();
            listDirectionRight.put(Direction.NORTH,this.moveFromNorth(initial));
            listDirectionRight.put(Direction.SOUTH,this.moveFromSouth(initial));
            listDirectionRight.put(Direction.WEST,this.moveFromWest(initial));
            listDirectionRight.put(Direction.EAST,this.moveFromEast(initial));

            return listDirectionRight;

    };
    Rover moveFromNorth(Rover initial);
    Rover moveFromSouth(Rover initial);
    Rover moveFromEast(Rover initial);
    Rover moveFromWest(Rover initial);
}
