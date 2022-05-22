package main;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

public class Main {
    public static void main(String[] args) throws PositionNullException, DirectionNullException {
        Rover rover = new Rover(new PointRover(0,0), Direction.South);

        System.out.println(rover.moveTo(Move.Foward));
    }
}
