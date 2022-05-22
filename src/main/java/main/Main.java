package main;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;

public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover(new PointRover(0,0), Direction.South);

        System.out.println(rover.moveTo(Move.Foward));
    }
}
