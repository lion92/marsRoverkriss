package obstacle;

import java.util.Objects;

public class Obstacle {

    private PointObstacle pointObstacle;

    public Obstacle(PointObstacle pointObstacle) {

        this.pointObstacle = pointObstacle;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obstacle)) return false;
        Obstacle obstacle = (Obstacle) o;
        return Objects.equals(pointObstacle, obstacle.pointObstacle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointObstacle);
    }

    public PointObstacle getPointObstacle() {
        return pointObstacle;
    }

    public void setPointObstacle(PointObstacle pointObstacle) {
        this.pointObstacle = pointObstacle;
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "pointObstacle=" + pointObstacle +
                '}';
    }
}
