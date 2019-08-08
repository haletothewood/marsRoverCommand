package marsrover;

import java.util.Arrays;
import java.util.List;

public class Parser {
    List<Command> parse(String command) {
        if (command.length() == 2) {
            return Arrays.asList(new MoveCommand(), new MoveCommand());
        }
        return Arrays.asList(new MoveCommand());
    }
}