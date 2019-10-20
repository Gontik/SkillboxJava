import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        System.out.println("Введите Фамилию, имя, отчество одной строкой:");
        String fio = new Scanner(System.in).nextLine().trim();          // Получаю ФИО из консоли и сразу обрезаю лишние пробелы по бокам

        String[] fioPart = fio.split("\\s+");                    // С регулярным выражением оказалось гораздо проще

        System.out.println("Фамилия: " + fioPart[0]);
        System.out.println("Имя: " + fioPart[1]);
        System.out.println("Отчество: " + fioPart[2]);
    }
}
