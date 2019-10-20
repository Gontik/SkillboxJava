public class Loader {

    // Метод выводит заданное количество символов подряд, начиная с заданного символа
    private static void alphabet(char chr, int count) {
        for (int i = (int)chr; i < (int)chr + count; i++) {
            System.out.println((char)i + " = " + String.valueOf(i));
        }

    }
    public static void main(String[] args) {
        alphabet('a', 26);
        alphabet('A', 26);
        alphabet('а', 32);
        alphabet('А', 32);
    }
}
