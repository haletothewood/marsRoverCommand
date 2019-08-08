package marsrover;

public class Commander {
    public Commander(MarsRover marsRover) {

    }

    public Command parse(String m) {
        return new MoveCommand();
    }
}
