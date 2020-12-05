import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DataTimeFormatterExample {
    
    public static void main(String[] args) {


        //as parameter to format method
        LocalDate localDate = LocalDate.of(2020, Month.DECEMBER, 5);
        LocalTime localTime = LocalTime.of(23,45,10);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        //format method of formatter itself:

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(shortDateTime.format(localDateTime));
    }
}
