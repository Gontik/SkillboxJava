
public class Loader
{
    public static void main(String[] args)
    {
        int Sum = 0;                            // Сумма заработка
        String[] digitText;                     // Массив строк, на которые разбивается текст
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

        // Сначала заменяю пробелом все символы, не являющиеся цифрами. Затем отсекаю пробелы вначале и вконце строки.
        // И разбиваю результат на массив строк по разделителю "пробелы"
        digitText = text.replaceAll("[^0-9]", " ").trim().split("\\s+");
        for (int i = 0; i < digitText.length; i++) {
            Sum += Integer.parseInt(digitText[i]);
        }
        System.out.println("Сумма заработка: " + Sum);
    }
}