package marsrover;

public class Parser {
    Command parse(String command) {
        return new MoveCommand();
    }
}