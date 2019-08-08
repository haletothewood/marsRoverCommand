package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserShould {

    @Test
    void when_commander_sees_M_commander_should_instantiate_a_move_command() {
        Parser parser = new Parser();

        assertThat(parser.parse("M")).allMatch(command -> command instanceof MoveCommand);
    }

    @Test
    void when_commander_sees_MM_commander_should_return_a_list_of_two_move_commands() {
        Parser parser = new Parser();

        assertThat(parser.parse("MM")).allMatch(command -> command instanceof MoveCommand);
    }
}
