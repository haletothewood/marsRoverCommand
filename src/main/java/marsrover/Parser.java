package marsrover;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    List<Command> parse(String command) {
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < command.length(); i++) {
            commands.add(new MoveCommand());
        }
        return commands;
    }
}