import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatExample {

    public static void main(String[] args) throws ParseException {

        NumberFormat numberFormat = NumberFormat.getInstance();

        System.out.println(numberFormat.format(46.23));

        System.out.println(numberFormat.parse("46,23"));

        NumberFormat currencyFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat currencyFormatUsa = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println(currencyFormatFrance.format(46.23));
        System.out.println(currencyFormatUsa.format(46.23));
    }
}
