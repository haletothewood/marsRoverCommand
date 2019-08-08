package marsrover;

public class MoveCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setY(marsRover.getY() + 1);
    }


}
