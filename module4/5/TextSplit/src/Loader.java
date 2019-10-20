public class Loader {

    public static void main(String[] args) {
        String text = "David Harbour on ‘SNL’: 3 Sketches You Have to See.\n" +
                "Ending its initial three-week run, Saturday Night Live closed with another strong episode that solidified this as one of the most promising seasons in several years. While more front-loaded than the first two episodes, this David Harbour-led installment reinforced its early patterns: celebrity-centric cold opens, a heaping help of Kate McKinnon, and plenty of space for the show’s newest cast members to stretch their legs. Bowen Yang and Chloe Fineman both got far more screen time than SNL stalwarts such as Kenan Thompson and Mikey Day this week, yet both feel like they have been there for quite some time already.\n" +
                "On weaker weeks, sketches such as “Sauce” and “Soul Cycle” would have made the cut. In the latter case, there was only so much room for sketches involving individuals doing solo bits. In the case of the former, the physical bits between McKinnon and Harbour were undeniably funny but not enough to overcome the lengthy running time and repetitive horror of their grandchildren.\n" +
                "But those are small quibbles in which even the weakest sketches had something to offer. For now, here are the three sketches people will talk about until Chance The Rapper returns as host/musical guest in two weeks. (Please oh please let there be another hockey sketch.)";
        System.out.println(text);

        String[] words = text.split("\\W+");             // Регулярное выражение \\W+ означает любой символ, кроме буквенного, цифрового или знака подчёркивания
        System.out.println("Количество слов в тексте: " + words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
