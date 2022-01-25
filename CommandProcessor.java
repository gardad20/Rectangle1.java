/**
 * This class reads input files and parses each line of commands.
 * It determines the correct method to be called and
 * pass the rectangle infomation (rectangle names or coordinates).
 * h
 */

public class CommandProcessor {
    /**
     * Instantiates a new command processor
     */
    public CommandProcessor(String fileName) throws FileNotFoundException {
        world = new World();
        run(new File(fileName));
    }

    /**
     * Read input file and parse each line of commands
     */
    public void run(File myFile) throws FileNotFoundException {
        //open file and parse every line of the file
        //command is a String
    }
}
