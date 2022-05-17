package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractDirection;

public class DirectionRoverEast extends AbstractDirection {
    @Override
    public Rover moveTo(Rover initial, String move) {
        if(initial.getDirection().equals(""+Direction.S)&&move.equals(""+Move.L)){
            return new Rover(new PointRover(initial.getXi(), initial.getYi()),""+Direction.E);
        }
            return new Rover(new PointRover(-1,0),""+Direction.E);



    }
}