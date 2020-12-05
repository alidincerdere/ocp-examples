import java.util.*;
public class ResourceBundleExample {
    

    public static void main(String[] args) {

        Locale us = new Locale("us");
        Locale french = new Locale("fr");
        Locale canadian = new Locale("en","CA");

        //printProperties(us);
        //printProperties(french);
        printProperties(canadian);


    }

    public static void printProperties(Locale locale){

        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);

        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
        System.out.println(rb.getString("visitor"));
        System.out.println("");

    }
}
