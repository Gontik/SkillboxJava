import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Loader {

    public static void main(String[] args) {
        // Константы даты рождения
        final int BIRTH_YEAR = 1983;
        final int BIRTH_MONTH = Calendar.AUGUST;
        final int BIRTH_DAY = 9;

        DateFormat dateformat = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        Calendar calendar = Calendar.getInstance();

        int countYears = calendar.get(Calendar.YEAR) - BIRTH_YEAR; // Рассчитываю разницу в годах, без учета даты
        calendar.set(BIRTH_YEAR, BIRTH_MONTH, BIRTH_DAY);

        // вывожу список дней рождений, начиная с 0
        for (int i = 0; i < countYears; i++) {
            System.out.println(i + " - " + dateformat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
        }

        // Если день рождения уже был в текущем году, то вывожу еще год
        if (new Date().compareTo(calendar.getTime()) >= 0) {
            System.out.println(countYears + " - " + dateformat.format(calendar.getTime()));
        }
    }
}
