package DirectionImplement;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import abstractRover.AbstractDirection;

public class DirectionRoverSouth extends AbstractDirection {
    @Override
    public Rover moveTo(Rover initial, String move) {
        if(initial.getDirection().equals(""+Direction.E)&&move.equals(""+Move.L)||initial.getDirection().equals(""+Direction.W)&&move.equals(""+Move.R)){
            return new Rover(new PointRover(initial.getXi(),initial.getYi()),""+Direction.S);
        }

        else if (move.equals("" + Move.F)) {

            return new Rover(new PointRover(initial.getXi(), initial.getYi()-1), "" + initial.getDirection());
        }
        else if (move.equals("" + Move.B)) {

            return new Rover(new PointRover(initial.getXi(), initial.getYi()+1), "" + initial.getDirection());
        }
        return initial;
    }
}
