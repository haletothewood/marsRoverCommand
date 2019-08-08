package marsrover;

public class Commander {
    private MarsRover marsRover;
    private Parser parser;

    public Commander(MarsRover marsRover, Parser parser) {
        this.marsRover = marsRover;
        this.parser = parser;
    }

    public void giveOrder(String order) {
        Command command = parser.parse(order);
        command.execute(marsRover);
    }
}
