package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveCommandShould {
    @Test
    void move_rover_ahead_in_one_step() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        Command moveCommand = new MoveCommand();

        moveCommand.execute(marsRover);

        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(2);
        assertThat(marsRover.getDirection()).isEqualTo("N");
    }
}
