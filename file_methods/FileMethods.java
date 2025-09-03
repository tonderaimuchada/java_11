import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {
        try {
            Files.writeString(Path.of("test.txt"), "Just Do It!");
            Files.readString(Path.of("test.txt"));

            Files.isSameFile(Path.of("test.txt"), Path.of("test.txt"));
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}