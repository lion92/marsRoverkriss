package DirectionImplement;
import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractDirection;

public class DirectionRoverNorth extends AbstractDirection {

    @Override
    public Rover moveTo(Rover initial, String move) {
        if(initial.getDirection().equals(""+Direction.E)&&move.equals(""+Move.L)){
            return new Rover(new PointRover(initial.getXi(), initial.getYi()),""+Direction.N);
        }
        return new Rover(new PointRover(0,1),""+Direction.N);



    }
}
