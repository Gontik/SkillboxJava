
public class Loader
{
    public static void main(String[] args)
    {
        int sum = 0;                            // Сумма заработка
        int beginIndex, endIndex;               // Начальный и конечный индекс числа в строке
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

        endIndex = text.indexOf(" руб");                                           // Нахожу первую встречу символов " руб"
        while (endIndex != -1) {                                                   // Пока символы " руб" найдены, то выполняю цикл
            beginIndex = text.substring(0, endIndex).lastIndexOf(' ');         // Нахождение начального индекса числа в строке
            sum += Integer.parseInt(text.substring(beginIndex, endIndex).trim());  // Выисление суммы
            text = text.substring(endIndex).trim();                                // Удаляю найденное число из строки
            if (text.indexOf(' ') != -1) {
                text = text.substring(text.indexOf(' '));                          // Удаляю все, что осталось после числа до первого пробела
            }
            endIndex = text.indexOf(" руб");                                       // Снова нахожу встречу символов " руб"
        }
        System.out.println("Сумма заработка: " + sum);
    }
}