import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        int index;                                                  // Индекс пробела в строке
        String[] fioPart = {"", "", ""};                            // Инициализация массива для хранения фамилии, имени и отчества

        System.out.println("Введите Фамилию, имя, отчество одной строкой:");
        String fio = new Scanner(System.in).nextLine().trim();      // Получаю ФИО из консоли и сразу обрезаю лишние пробелы по бокам

        for (int i = 0; i < fioPart.length; i++) {
            index = fio.indexOf(' ');
            if (index != -1) {                                      // Если пробел есть, то
                fioPart[i] = fio.substring(0, index);               //   извлекаю часть ФИО от начала строки до индекса пробела,
                fio = fio.substring(index).trim();                  //   обрезаю ФИО до пробела
            }
            else {                                                  // Если больше нет пробелов,
                fioPart[i] = fio;                                   //   то переношу в результат остаток строки и
                break;                                              //   выхожу из цикла
            }
        }

        System.out.println("Фамилия: " + fioPart[0]);
        System.out.println("Имя: " + fioPart[1]);
        System.out.println("Отчество: " + fioPart[2]);
    }
}
