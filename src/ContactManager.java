import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class ContactManager {

    public static void printContacts(Path filepath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filepath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        //Declare the directory and file path as a String
        String directory = "src/data";
        String fileName = "contacts.txt";

        //Declare the PATH for the directory and file

        Path dataDirectory = Paths.get(directory);
        Path directoryAndContactsFile = Paths.get(directory, fileName);

        //Creating the directory and file
        if(Files.notExists(directoryAndContactsFile)) {
            Files.createDirectories(dataDirectory);
            Files.createFile(directoryAndContactsFile);
        }
        //Ensuring that the directory and file is created
//        System.out.println("directoryAndContactsFile = " + directoryAndContactsFile);


    }
}
