package DrawGraph;

import DirectionMoveEmum.Move;
import Rover.*;

import java.util.List;

public class Drawgraph {


    private final int beginline;
    private final int beginColon;
    private final int endLine;
    private final int endColon;

    public Drawgraph(int beginline, int endLine, int beginColon, int endColon) {


        this.beginline = beginline;
        this.beginColon = beginColon;
        this.endLine = endLine;
        this.endColon = endColon;
    }

    public String grilleRover(Rover rover, List<Move> commandRover, List<Obstacle> obstacles) {
        StringBuilder grille = new StringBuilder();

        for (Move move : commandRover) {
            System.out.print("----------------\n");
            grille.append("----------------\n");
            for (Obstacle obstacle : obstacles) {
                if (rover.getPointRover().positionRoverAbscisse() ==
                        obstacle.getPositionAbscisse() && rover.getPointRover().positionRoverOrdonne() ==
                        obstacle.getPositionOrdonne()
                ) {
                    return obstacle.toString();
                }
            }


            for (int beginColon = this.beginColon; beginColon < this.endColon; beginColon++) {
                for (int beginLine = this.beginline; beginLine < this.endLine; beginLine++) {


                    if (rover.getPointRover().positionRoverAbscisse() ==
                            beginLine && rover.getPointRover().positionRoverOrdonne() == -beginColon) {
                        System.out.print("O");
                        grille.append("0");
                    } else if (beginColon == 0 && beginColon == 0) {
                        System.out.print("X");
                        grille.append("X");
                    } else {
                        System.out.print("x");
                        grille.append("x");
                    }

                }
                grille.append("\n");
                System.out.println("");
            }
            System.out.println(move + " " + rover.toString());
            rover = rover.moveTo(move);
            System.out.print("----------------");
            grille.append("----------------");

        }
        return grille.toString();
    }


}
