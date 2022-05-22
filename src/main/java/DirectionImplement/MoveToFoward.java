package DirectionImplement;

import Rover.*;
import abstractRover.AbstractMove;

public class MoveToFoward extends AbstractMove {




    @Override
    public Rover moveTo(Rover initial) {

        switch (initial.getDirection()) {
            case Norh -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()+1), initial.getDirection());
            }
            case South -> {
                return new Rover(new PointRover(initial.getXi() , initial.getYi()-1), initial.getDirection());
            }
            case East -> {
                return new Rover(new PointRover(initial.getXi() -1, initial.getYi()), initial.getDirection());
            }
            case West -> {
                return new Rover(new PointRover(initial.getXi() + 1, initial.getYi()), initial.getDirection());
            }


        }
        return initial;

    }
}
