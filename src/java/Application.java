package java;

import java.file.ClazzFinderFileReader;
import java.file.FileReader;
import java.input.InputHandler;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    private InputHandler inputHandler;
    private FileReader clazzNameFileReader = new ClazzFinderFileReader();

    public static void main(String[] args) throws Exception {

        Path inputFilePath = Paths.get(args[0]);
        if (inputFilePath.toFile().exists()) {
            System.out.println("Real path: "
                    + inputFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
        } else {
            System.out.println("The file does not exist");
        }
    }

}