package main;

import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.*;
import Rover.Exception.DirectionNullException;
import Rover.Exception.PositionNullException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PositionNullException, DirectionNullException {
        List<Move> commandRover=List.of(Move.Foward,Move.Backward,Move.Left,Move.Foward,Move.Right);
        Rover rover = new Rover(new PointRover(0,0), Direction.South);
        for(int i=0;i<commandRover.size();i++){

            System.out.println(commandRover.get(i)+" "+rover.toString());
            rover=rover.moveTo(commandRover.get(i));
        }


    }
}
