
import DirectionMoveEmum.Direction;
import DirectionMoveEmum.Move;
import Rover.PointRover;
import Rover.Rover;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void should_return_false_if_all_are_fine(){
        assertThat(false).isFalse();
    }


    @Test
    public void should_return_north_x0_y1_when_it_go_foward_since_the_position_x0_y0_North(){

        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial, ""+Direction.N);

        PointRover positionFinal=new PointRover(0,1);
        Rover roverFinal = new Rover(positionFinal,""+Direction.N);



        assertThat(roverInitial.moveTo(roverInitial, ""+Move.F)).isEqualTo(roverFinal);

    }

    @Test
    public void should_return_east_xmoins1_y0_when_it_go_foward_since_the_position_x0_y0_east(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.E);

        PointRover positionFinal=new PointRover(-1,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.E);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.F)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_east_xmoins2_y0_when_it_go_foward_since_the_position_xmoins1_y0_east(){
        PointRover positionInitial=new PointRover(-1,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.E);

        PointRover positionFinal=new PointRover(-2,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.E);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.F)).isEqualTo(roverFinal);
    }


    @Test
    public void should_return_south_x0_ymoins1_when_it_go_backward_since_the_position_x0_y0_South(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.S);

        PointRover positionFinal=new PointRover(0,-1);
        Rover roverFinal = new Rover(positionFinal,""+Direction.S);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.F)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_south_x0_ymoins2_when_it_go_backward_since_the_position_x0_ymoins1_South(){
        PointRover positionInitial=new PointRover(0,-1);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.S);

        PointRover positionFinal=new PointRover(0,-2);
        Rover roverFinal = new Rover(positionFinal,""+Direction.S);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.B)).isEqualTo(roverFinal);
    }


    @Test
    public void should_return_west_x1_y0_when_it_go_left_since_the_position_x0_y0_West(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial, ""+ Direction.W);

        PointRover positionFinal=new PointRover(1,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.W);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.F)).isEqualTo(roverFinal);
    }



    @Test
    public void should_return_south_x0_y0_when_it_go_left_since_the_position_x0_y0_West(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.S);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.W);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.L)).isEqualTo(roverFinal);
    }



    @Test
    public void should_return_south_x0_y0_when_it_go_left_since_the_position_x0_y0_east(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.E);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.S);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.L)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_west_x0_y0_when_it_go_left_since_the_position_x0_y0_south(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.S);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.W);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.L)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_west_x0_y0_when_it_go_right_since_the_position_x0_y0_north(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.N);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.W);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.R)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_south_x0_y0_when_it_go_right_since_the_position_x0_y0_west(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.W);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.S);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.R)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_east_x0_y0_when_it_go_right_since_the_position_x0_y0_south(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.S);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.E);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.R)).isEqualTo(roverFinal);
    }

    @Test
    public void should_return_north_x0_y0_when_it_go_right_since_the_position_x0_y0_east(){
        PointRover positionInitial=new PointRover(0,0);
        Rover roverInitial=new Rover(positionInitial,  ""+Direction.E);

        PointRover positionFinal=new PointRover(0,0);
        Rover roverFinal = new Rover(positionFinal,""+Direction.N);



        assertThat(roverInitial.moveTo(roverInitial,""+Move.R)).isEqualTo(roverFinal);
    }


}
