package moveImplement;

import listDirectionMove.ListDirectionMove;
import rover.*;
import interfaceMove.InterfaceMove;

public class MoveToBackward implements InterfaceMove {


    @Override
    public Rover move(Rover initial) {



            return  new ListDirectionMove().getlistDirectionBackward(initial).get(initial.getDirection());

    }

    @Override
    public Rover moveFromWest(Rover initial) {
        return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().positionRoverOrdonne()), initial.getDirection());
    }

    @Override
    public Rover moveFromEast(Rover initial)  {
        return new Rover(new PointRover(calculPositionAfterMoving(initial), initial.getPointRover().positionRoverOrdonne()), initial.getDirection());
    }

    @Override
    public Rover moveFromSouth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , calculPositionAfterMoving(initial)), initial.getDirection());
    }

    @Override
    public Rover moveFromNorth(Rover initial)  {
        return new Rover(new PointRover(initial.getPointRover().positionRoverAbscisse() , calculPositionAfterMoving(initial)), initial.getDirection());
    }

    private int calculPositionAfterMoving(Rover initial) {
        switch (initial.getDirection()) {
            case North -> {
                return (initial.getPointRover().positionRoverOrdonne() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverOrdonne() - 1) % 6 - 1 : initial.getPointRover().positionRoverOrdonne() -1;
            }
            case South -> {
                return ((initial.getPointRover().positionRoverOrdonne() + 1) % 6) == 0 ? (initial.getPointRover().positionRoverOrdonne() +1) % 6 + 1 : initial.getPointRover().positionRoverOrdonne() + 1;
            }
            case East -> {
                return (initial.getPointRover().positionRoverAbscisse() + 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() + 1) % 6 + 1 : initial.getPointRover().positionRoverAbscisse() + 1;
            }
            case West -> {
                return (initial.getPointRover().positionRoverAbscisse() - 1) % 6 == 0 ? (initial.getPointRover().positionRoverAbscisse() - 1) % 6 - 1 : initial.getPointRover().positionRoverAbscisse() - 1;
            }


        }
        return 0;
    }


}
