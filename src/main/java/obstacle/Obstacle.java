package obstacle;

import java.util.Objects;

public class Obstacle {
    private final int positionAbscisse;
    private final int positionOrdonne;

    public Obstacle(int positionAbscisse, int positionOrdonne) {
        this.positionAbscisse = positionAbscisse;
        this.positionOrdonne = positionOrdonne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obstacle)) return false;
        Obstacle obstacle = (Obstacle) o;
        return positionAbscisse == obstacle.positionAbscisse && positionOrdonne == obstacle.positionOrdonne;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionAbscisse, positionOrdonne);
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "positionAbscisse=" + positionAbscisse +
                ", positionOrdonne=" + positionOrdonne +
                '}';
    }

    public int getPositionAbscisse() {
        return positionAbscisse;
    }

    public int getPositionOrdonne() {
        return positionOrdonne;
    }
}
