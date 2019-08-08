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
    void when_commander_sees_MM_commander_should_return_a_list_of_move_commands() {
        Parser parser = new Parser();

        assertThat(parser.parse("MM")).allMatch(command -> command instanceof MoveCommand);
    }

    @Test
    void when_commander_sees_MM_commander_should_return_a_list_of_2() {
        Parser parser = new Parser();

        assertThat(parser.parse("MM")).hasSize(2);
    }

    @Test
    void when_commander_sees_MMM_commander_should_return_a_list_3() {
        Parser parser = new Parser();

        assertThat(parser.parse("MMM")).hasSize(3);
    }
}
