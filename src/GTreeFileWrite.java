
import java.io.FileWriter;
import java.io.IOException;

public interface GTreeFileWrite {
    default void Savefile(String string) {
        try (FileWriter file = new FileWriter("GTsave.txt")) {
            file.append(string);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
