import java.util.Scanner;

public class Loader {
    static final int CONTAINERS_CAPACITY    = 12;                   // Сколько контейнеров помещается в грузовик
    static final int DRAWERS_CAPACITY       = 27;                   // Сколько ящиков помещается в контейнер

    public static void main(String[] args) {
        // Чтобы не запутаться, объявляю переменные отдельно от основного кода
        int drawersCount;                                           // Количество ящиков
        int containersCount;                                        // Количество контейнеров. Вычисляется, исходя из количества ящиков
        int trucksCount;                                            // Количество грузовиков. Вычисляется, исходя из количества контейнеров
        int remainDrawersCount;                                     // Остаточное количество ящиков, которые не заполнили полностью контейнер
        int remainContainersCount;                                  // Остаточное количество контейнеров, которые не заполнили полностью контейнер
        int containerNum;                                           // Номер текущего контейнера
        int drawerNum;                                              // Номер текущего ящика

        System.out.println("Введите количество ящиков: ");
        drawersCount = new Scanner(System.in).nextInt();

        // Вычисляю количество заполненных контейнеров. Равно целочисленному результату деления количества ящиков на вместимость контейнера
        containersCount = Math.floorDiv(drawersCount, DRAWERS_CAPACITY);

        // Вычисляю количество заполненных грузовиков. Равно целочисленному результату деления количества полных контейнеров на вместимость грузовика
        trucksCount =  Math.floorDiv(containersCount, CONTAINERS_CAPACITY);

        // Вычисляю необходимое количество грузовиков и контейнеров:
        // Сначала вычисляю количество оставшихся ящиков, которые не заполнили полностью контейнер. Равно остатку от деления
        // количества ящиков на вместимость контейнера
        remainDrawersCount = drawersCount % DRAWERS_CAPACITY;
        // Затем вычисляю количество оставшихся контейнеров, которые не заполнили полностью грузовик. Равно остатку от деления
        // количества полных контейнеров на вместимость грузовика
        remainContainersCount = containersCount % CONTAINERS_CAPACITY;
        // Если остатки положительные, то прибавляю 1 к грузовикам и контейнерам
        if (remainContainersCount > 0 || remainDrawersCount > 0) {
            trucksCount++;
            if (remainDrawersCount > 0) {
                containersCount++;
            }
        }
        System.out.println("Всего нужно грузовиков: " + trucksCount);
        System.out.println("Всего нужно контейнеров: " + containersCount);

        // Наполняю грузовики. Теперь все в одной группе циклов
        for (int i = 0; i < trucksCount; i++) {
            System.out.println("Грузовик " + (i + 1) + ":");
            for (int j = 0; j < CONTAINERS_CAPACITY ; j++) {
                containerNum = j + i * CONTAINERS_CAPACITY + 1;
                if (containerNum > containersCount) {
                    break;
                }
                System.out.println("\tКонтейнер " + containerNum + ":");
                for (int k = 0; k < DRAWERS_CAPACITY; k++) {
                    drawerNum = k + (j + i * CONTAINERS_CAPACITY) * DRAWERS_CAPACITY + 1;
                    if (drawerNum > drawersCount) {
                        break;
                    }
                    System.out.println("\t\tЯщик " + drawerNum);
                }
            }
        }
    }
}
