import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java8DateTimeAPI {
    public static void main(String [] args)
    {
        LocalDate obj=LocalDate.now();
        System.out.println(obj);

        LocalTime ref = LocalTime.now();
        System.out.println(ref);


        System.out.println(obj.getEra());
        System.out.println(obj.getDayOfMonth());
        System.out.println(obj.getDayOfYear());
        System.out.println(obj.getDayOfWeek());
        System.out.println(obj.isLeapYear());
        DateTimeFormatter refe =DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(refe.format(obj));

    }
}
