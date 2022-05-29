package drawGraph;

import listDirectionMove.directionMoveEmum.Move;
import rover.*;
import obstacle.Obstacle;

import java.util.List;

public class Drawgraph {


    private final int beginning;
    private final int beginColon;
    private final int endLine;
    private final int endColon;

    public Drawgraph(int beginning, int endLine, int beginColon, int endColon) {


        this.beginning = beginning;
        this.beginColon = beginColon;
        this.endLine = endLine;
        this.endColon = endColon;
    }

    public String grilleRoverGenerator(Rover rover, List<Move> commandRover, List<Obstacle> obstacles) {
        StringBuilder grille = new StringBuilder();
        for (Move move : commandRover) {
            grille.append("----------------\n");
            for (Obstacle obstacle : obstacles) {
                if (ismeetingObstacle(rover, obstacle)
                ) {
                    return obstacle.toString();
                }
            }
            for (int currentColon = this.beginColon; currentColon < this.endColon; currentColon++) {
                for (int curentLine = this.beginning; curentLine < this.endLine; curentLine++) {

                    if (isPositionRover(rover, currentColon, curentLine)) {
                        positionRover(grille);
                    } else if (isOriginGrid(currentColon,curentLine)) {
                        positionOrigin(grille);
                    } else {
                        positionPossible(grille);
                    }
                }
                grille.append("\n");
            }
            rover = getRover(rover, move);
            System.out.print(rover.toString());
            grille.append("----------------");
        }
        return grille.toString();
    }

    private Rover getRover(Rover rover, Move move) {
        return rover.moveTo(move);
    }

    private StringBuilder positionPossible(StringBuilder grille) {
        return grille.append("x");
    }

    private StringBuilder positionRover(StringBuilder grille) {
        return  grille.append("0");
    }

    private StringBuilder positionOrigin(StringBuilder grille) {
        return grille.append("X");

    }

    private boolean isOriginGrid(int beginColon,int line) {
        return beginColon == 0 && line == 0;
    }

    private boolean isPositionRover(Rover rover, int currentColon, int currentLine) {
        return rover.getPointRover().positionRoverAbscisse() ==
                currentLine && rover.getPointRover().positionRoverOrdonne() == -currentColon;
    }

    private boolean ismeetingObstacle(Rover rover, Obstacle obstacle) {
        return (rover.getPointRover().positionRoverAbscisse() ==
                obstacle.getPointObstacle().positionAbscisse()) && (rover.getPointRover().positionRoverOrdonne() ==
                obstacle.getPointObstacle().postionOrdonne());
    }


}
