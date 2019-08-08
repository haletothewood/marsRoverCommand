package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {
    @Test
    void move_in_the_same_direction_one_position_when_move_command_given() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        Commander commander = new Commander(marsRover);

        commander.parse("M");

        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(2);
        assertThat(marsRover.getDirection()).isEqualTo("N");
    }
}
