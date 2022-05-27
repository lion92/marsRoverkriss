package main;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import DrawGraph.Drawgraph;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

import java.rmi.MarshalledObject;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PositionNullException, DirectionNullException {
        List<Move> commandRover=List.of(Move.Backward,Move.Backward, Move.Backward,Move.Backward,Move.Backward,Move.Backward,Move.Backward);
        Rover rover = new Rover(new PointRover(0,0), Direction.East);
        System.out.println(new Drawgraph(-5,6,-5,6).grilleRoverGenerator(rover, commandRover,List.of()));




    }
}
