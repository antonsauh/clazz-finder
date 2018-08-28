package java.input;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputHandler {

    private Path inputFilePath;
    private File inputFile;
    private String searchCriteria;

    public InputHandler() {
    }

    public InputHandler(String pathToInputFile, String searchCriteria) {
        this.searchCriteria = searchCriteria;
        this.inputFilePath = Paths.get(pathToInputFile);
    }

    public Path getInputFilePath() {
        return inputFilePath;
    }

    public void setInputFilePath(Path inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
}
