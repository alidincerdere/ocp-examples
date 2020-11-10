import java.io.Console;
import java.io.File;
import java.io.IOException;
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
        System.out.println("File name is :" + path.getFileName());

        for(int i=0; i<path.getNameCount(); i++)
            System.out.println("element " + i + "is " + path.getName(i));

        Path parent = path.getParent();
        while(parent != null) {
            System.out.println("parent " + parent);
            parent = parent.getParent();
        }

        System.out.println("Root is " + path.getRoot());

        System.out.println("is absolute: " + path.isAbsolute());

        System.out.println("subpath 0 to 1 " + path.subpath(0,1));

        try {
            System.out.println(Paths.get(".").toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
