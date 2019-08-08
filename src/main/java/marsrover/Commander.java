package marsrover;

import java.util.List;

public class Commander {
    private MarsRover marsRover;
    private Parser parser;

    public Commander(MarsRover marsRover, Parser parser) {
        this.marsRover = marsRover;
        this.parser = parser;
    }

    public void giveOrder(String order) {
        List<Command> commands = parser.parse(order);
        for (Command command :commands ) {
            command.execute(marsRover);
        }
    }
}
