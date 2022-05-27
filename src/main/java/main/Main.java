package main;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import DrawGraph.Drawgraph;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PositionNullException, DirectionNullException {
        List<Move> commandRover=List.of(Move.Foward,Move.Backward,Move.Left,Move.Foward,Move.Right,Move.Foward,Move.Backward);
        Rover rover = new Rover(new PointRover(0,0), Direction.South);
        System.out.println(new Drawgraph(-4,6,-4,6).grilleRover(rover, commandRover,List.of(new Obstacle(1,0),new Obstacle(1,1))));




    }
}
