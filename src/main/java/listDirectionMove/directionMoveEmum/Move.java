package listDirectionMove.directionMoveEmum;

import listDirectionMove.interfaceMove.InterfaceMove;
import moveImplement.MoveToBackward;
import moveImplement.MoveToForward;
import moveImplement.MoveToLeft;
import moveImplement.MoveToRight;

public enum Move {
    FORWARD(new MoveToForward()),
    Left(new MoveToLeft()),
    Backward(new MoveToBackward()),
    Right(new MoveToRight());

    private final InterfaceMove interfaceMove;

    Move(InterfaceMove interfaceMove){
        this.interfaceMove = interfaceMove;
    }

    public InterfaceMove getInterfaceMove() {
        return interfaceMove;
    }
}
