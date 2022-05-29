package listDirectionMove;


import listDirectionMove.directionMoveEmum.Direction;
import listDirectionMove.directionMoveEmum.Move;

import moveImplement.MoveToBackward;
import moveImplement.MoveToForward;
import moveImplement.MoveToLeft;
import moveImplement.MoveToRight;
import rover.Rover;

import java.util.HashMap;

public class ListDirectionMove {

    public ListDirectionMove() {
    }

    private HashMap<Move,Rover> listMove;

    private HashMap<Direction,Rover> listDirectionBackward;
   private HashMap<Direction,Rover> listDirectionForward;
    private HashMap<Direction, Rover> listDirectionRight;
   private HashMap<Direction,Rover> listDirectionLeft;


   public HashMap<Move,Rover> getListMove(Rover initial){
       listMove=new HashMap<>();
       listMove.put(Move.Foward,new MoveToForward().move(initial));
       listMove.put(Move.Right,new MoveToRight().move(initial));
       listMove.put(Move.Left,new MoveToLeft().move(initial));
       listMove.put(Move.Backward,new MoveToBackward().move(initial));
       return listMove;
   }

    public HashMap<Direction, Rover> getlistDirectionBackward(Rover initial){
        listDirectionBackward = new HashMap<Direction, Rover>();
        listDirectionBackward.put(Direction.North,new MoveToBackward().moveFromNorth(initial));
        listDirectionBackward.put(Direction.South,new MoveToBackward().moveFromSouth(initial));
        listDirectionBackward.put(Direction.West,new MoveToBackward().moveFromWest(initial));
        listDirectionBackward.put(Direction.East,new MoveToBackward().moveFromEast(initial));

        return listDirectionBackward;
    }

    public HashMap<Direction, Rover> getlistDirectionForward(Rover initial){
        listDirectionForward = new HashMap<Direction, Rover>();
        listDirectionForward.put(Direction.North,new MoveToForward().moveFromNorth(initial));
        listDirectionForward.put(Direction.South,new MoveToForward().moveFromSouth(initial));
        listDirectionForward.put(Direction.West,new MoveToForward().moveFromWest(initial));
        listDirectionForward.put(Direction.East,new MoveToForward().moveFromEast(initial));

        return listDirectionForward;
    }
    public HashMap<Direction, Rover> getlistDirectionLeft(Rover initial){
        listDirectionLeft = new HashMap<Direction, Rover>();
        listDirectionLeft.put(Direction.North,new MoveToLeft().moveFromNorth(initial));
        listDirectionLeft.put(Direction.South,new MoveToLeft().moveFromSouth(initial));
        listDirectionLeft.put(Direction.West,new MoveToLeft().moveFromWest(initial));
        listDirectionLeft.put(Direction.East,new MoveToLeft().moveFromEast(initial));

        return listDirectionLeft;
    }
    public HashMap<Direction, Rover> getlistDirectionRight(Rover initial){
        listDirectionRight = new HashMap<Direction, Rover>();
        listDirectionRight.put(Direction.North,new MoveToRight().moveFromNorth(initial));
        listDirectionRight.put(Direction.South,new MoveToRight().moveFromSouth(initial));
        listDirectionRight.put(Direction.West,new MoveToRight().moveFromWest(initial));
        listDirectionRight.put(Direction.East,new MoveToRight().moveFromEast(initial));

        return listDirectionRight;
    }
}
