import java.util.Scanner;

public class Loader {

    public static void main(String[] args) {
        // Варианты замены номеров
        //+7   904v123-67-87
        //8 (905) 6732222
        //909 45623-11
        System.out.println("Введите номер телефона:");
        String phone = new Scanner(System.in).nextLine().trim();
        phone = phone.replaceAll("[^0-9]", "");
        if (phone.charAt(0) == '9' && phone.length() < 11) {         // Если первый символ 9 и длина номера меньше 11 цифр,
            phone = "7" + phone;                                     //   то добавляю код страны
        }
        else if (phone.charAt(0) == '8') {                           // Если первый символ 8,
            phone = phone.replaceFirst("8", "7"); //    то меняю код страны 8 на 7
        }

        // Итоговый формат: +7 909 123-45-67
        System.out.println(phone);
        // Немного прочитал про регулярные выражения. Форматирую в соответствии с задачей
        phone = phone.replaceAll("(\\d{1})(\\d{3})(\\d{3})(\\d{2})(\\d+)", "+$1 $2 $3-$4-$5");
        System.out.println(phone);
    }
}
