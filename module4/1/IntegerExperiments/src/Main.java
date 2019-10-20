public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(container.count);

        int digit = 123456;
        System.out.println("Сумма чисел числа " + digit + " = " + sumDigits(digit));
    }

    public static Integer sumDigits(Integer number)
    {
        String s = number.toString();
        int sum = 0;
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++)
        {
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}
