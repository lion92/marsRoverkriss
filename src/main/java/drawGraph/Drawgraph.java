package drawGraph;

import listDirectionMove.directionMoveEmum.Move;
import rover.*;
import obstacle.Obstacle;

import java.util.List;
import java.util.stream.IntStream;

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
            rover = getRoverAfterMoving(rover, move);
            grille.append("----------------\n");
            for (Obstacle obstacle : obstacles) {
                if (detectionObstacle(rover, obstacle)) {
                    return obstacle.toString();
                };
            }
            currentCollone(rover, grille);

            System.out.print(rover.toString());
            grille.append("----------------");
        }
        return grille.toString();
    }

    private Rover getRoverAfterMoving(Rover rover, Move move) {
        rover = getRover(rover, move);
        return rover;
    }

    private void currentCollone(Rover rover, StringBuilder grille) {
        for (int currentColon = this.beginColon; currentColon < this.endColon; currentColon++) {
            currentline(rover, grille, currentColon);

        }
    }

    private void currentline(Rover rover, StringBuilder grille, int currentColon) {
        IntStream stream = IntStream.range(this.beginning, this.endLine);

        for (int curentLine = this.beginning; curentLine < this.endLine; curentLine++) {

            pointGrille(rover, grille, currentColon, curentLine);
        }
    }

    private boolean detectionObstacle(Rover rover, Obstacle obstacle) {
        if (ismeetingObstacle(rover, obstacle)
        ) {
            return true;
        }
        return false;
    }

    private void pointGrille(Rover rover, StringBuilder grille, int currentColon, int curentLine) {
        if (isPositionRover(rover, currentColon, curentLine)) {
            positionRover(grille);
        } else if (isOriginGrid(currentColon, curentLine)) {
            positionOrigin(grille);
        } else {
            positionPossible(grille);
        }
    }

    private Rover getRover(Rover rover, Move move) {
        return rover.moveTo(move);
    }

    private StringBuilder positionPossible(StringBuilder grille) {
        return grille.append(".");
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
