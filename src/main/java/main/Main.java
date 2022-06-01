package main;

import listDirectionMove.directionMoveEmum.Direction;
import listDirectionMove.directionMoveEmum.Move;
import drawGraph.Drawgraph;
import rover.*;
import rover.Exception.DirectionNullException;
import rover.Exception.PositionNullException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PositionNullException, DirectionNullException {
        args[1] == "FLFRF"
        List<Move> commandRover=List.of(Move.FORWARD,Move.LEFT,Move.FORWARD,Move.RIGHT,Move.FORWARD);
        Rover rover = new Rover(new PointRover(0,0), Direction.EAST);
        System.out.println(new Drawgraph(-5,6,-5,6).grilleRoverGenerator(rover, commandRover,List.of()));


    }
}N
