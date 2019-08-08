package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserShould {

    @Test
    void when_commander_sees_M_commander_should_instantiate_a_move_command() {
        Parser parser = new Parser();
        assertThat(parser.parse("M")).isInstanceOf(MoveCommand.class);
    }
}
