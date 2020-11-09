import java.io.Console;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFirstExample {


    public static void main(String[] args) {

        Path path = Paths.get("nio2/deneme.txt");

        System.out.println(path.getFileName());
        File file = path.toFile();
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());


        System.out.println("The path name is: " + path);

        for(int i=0; i<path.getNameCount(); i++)
            System.out.println("element " + i + "is " + path.getName(i));
    }


}
