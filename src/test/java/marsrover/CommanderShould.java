package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommanderShould {

    public static final MarsRover DUMMY_MARS_ROVER = null;

    @Test
    void when_commander_sees_M_commander_should_instantiate_a_move_command() {
        Commander commander = new Commander(DUMMY_MARS_ROVER);

        assertThat(commander.parse("M")).isInstanceOf(MoveCommand.class);
    }


}
