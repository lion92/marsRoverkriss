
import listDirectionMove.directionMoveEmum.Direction;
import listDirectionMove.directionMoveEmum.Move;
import drawGraph.Drawgraph;
import obstacle.PointObstacle;
import rover.Exception.DirectionNullException;
import rover.Exception.PositionNullException;
import rover.PointRover;
import rover.*;
import obstacle.Obstacle;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class RoverTest {

    @Test
    public void should_return_false_if_all_are_fine() {
        assertThat(false).isFalse();
    }


    @Test
    public void should_return_north_x0_y1_when_it_go_foward_from_the_position_x0_y0_North() throws PositionNullException, DirectionNullException {

        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.NORTH);

        PointRover positionFinal = new PointRover(0, 1);
        Rover roverFinal = Rover.build(positionFinal, Direction.NORTH);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);

    }

    @Test
    public void should_return_east_xmoins1_y0_when_it_go_foward_from_the_position_x0_y0_east() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.EAST);

        PointRover positionFinal = new PointRover(-1, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.EAST);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_east_xmoins2_y0_when_it_go_foward_from_the_position_xmoins1_y0_east() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(-1, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.EAST);

        PointRover positionFinal = new PointRover(-2, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.EAST);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }


    @Test
    public void should_return_south_x0_ymoins1_when_it_go_backward_from_the_position_x0_y0_South() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);

        PointRover positionFinal = new PointRover(0, -1);
        Rover roverFinal = Rover.build(positionFinal, Direction.SOUTH);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_south_x0_ymoins2_when_it_go_backward_from_the_position_x0_ymoins1_South() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, -1);
        Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);

        PointRover positionFinal = new PointRover(0, 1);
        Rover roverFinal = Rover.build(positionFinal, Direction.SOUTH);


        assertThat(roverInitial.moveTo(Move.BACKWARD)).isEqualTo(roverFinal);
    }


    @Test
    public void should_return_west_x1_y0_when_it_go_left_from_the_position_x0_y0_West() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.WEST);

        PointRover positionFinal = new PointRover(1, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.WEST);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }


    @Test
    public void should_return_south_x0_y0_when_it_go_left_from_the_position_x0_y0_West() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.WEST);


        assertThat(roverInitial.moveTo(Move.LEFT)).isEqualTo(roverFinal);
    }


    @Test
    public void should_return_south_x0_y0_when_it_go_left_from_the_position_x0_y0_east() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.EAST);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.SOUTH);


        assertThat(roverInitial.moveTo(Move.LEFT)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_west_x0_y0_when_it_go_left_from_the_position_x0_y0_south() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.WEST);


        assertThat(roverInitial.moveTo(Move.LEFT)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_west_x0_y0_when_it_go_right_from_the_position_x0_y0_north() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.NORTH);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.WEST);


        assertThat(roverInitial.moveTo(Move.RIGHT)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_south_x0_y0_when_it_go_right_from_the_position_x0_y0_west() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.WEST);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.SOUTH);


        assertThat(roverInitial.moveTo(Move.RIGHT)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_east_x0_y0_when_it_go_right_from_the_position_x0_y0_south() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.EAST);


        assertThat(roverInitial.moveTo(Move.RIGHT)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_north_x0_y0_when_it_go_right_from_the_position_x0_y0_east() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.EAST);

        PointRover positionFinal = new PointRover(0, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.NORTH);


        assertThat(roverInitial.moveTo(Move.RIGHT)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_exception_if_posoitionNull_when_the_robot_go_foward_from_south_and_the_position_initial_is_null() {

        assertThatExceptionOfType(PositionNullException.class)
                .isThrownBy(() -> {
                    PointRover positionInitial = null;
                    Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);


                });
    }

    @Test
    public void should_return_exception_if_directionNull_when_the_robot_go_foward_from_south_and_the_direction_is_null() {

        assertThatExceptionOfType(DirectionNullException.class)
                .isThrownBy(() -> {
                    PointRover positionInitial = new PointRover(0, 0);
                    Rover roverInitial = Rover.build(positionInitial, null);


                });
    }

    @Test
    public void should_return_north_x0_y0_when_it_go_foward_from_the_position_x0_y5_north() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 5);
        Rover roverInitial = Rover.build(positionInitial, Direction.NORTH);

        PointRover positionFinal = new PointRover(0, 1);
        Rover roverFinal = Rover.build(positionFinal, Direction.NORTH);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_west_x0_y0_when_it_go_foward_from_the_position_x5_y0_west() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(5, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.WEST);

        PointRover positionFinal = new PointRover(1, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.WEST);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_east_x0_y0_when_it_go_foward_from_the_position_xmoins5_y0_east() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(-5, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.EAST);

        PointRover positionFinal = new PointRover(-1, 0);
        Rover roverFinal = Rover.build(positionFinal, Direction.EAST);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_south_x0_y0_when_it_go_foward_from_the_position_x0_ymoins5_south() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, -5);
        Rover roverInitial = Rover.build(positionInitial, Direction.SOUTH);

        PointRover positionFinal = new PointRover(0, -1);
        Rover roverFinal = Rover.build(positionFinal, Direction.SOUTH);


        assertThat(roverInitial.moveTo(Move.FORWARD)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_south_x0_y0_when_it_go_foward_twice_from_the_position_x0_y0_north() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.NORTH);

        for (int i = 0; i < 2; i++) {
            roverInitial = roverInitial.moveTo(Move.FORWARD);
        }

        PointRover positionFinal = new PointRover(0, 2);
        Rover roverFinal = Rover.build(positionFinal, Direction.NORTH);


        assertThat(roverInitial).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_obstacle_when_it_go_foward_twice_from_the_position_x0_y0_north_and_there_are_obstacle_x0_y1() throws PositionNullException, DirectionNullException {
        PointRover positionInitial = new PointRover(0, 0);
        Rover roverInitial = Rover.build(positionInitial, Direction.NORTH);

        List<Move> commandRover = List.of(Move.FORWARD, Move.FORWARD);


        assertThat(new Drawgraph(-4, 6, -4, 6)
                .grilleRoverGenerator(roverInitial, commandRover, List.of(new Obstacle(new PointObstacle(0, 1)))).equals(new Obstacle((new PointObstacle(0, 1))).toString()));
    }


}
