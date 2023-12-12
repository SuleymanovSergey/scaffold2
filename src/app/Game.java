package app;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Scaffold currentScaffold = new Scaffold();

    public static void start() {
        String word = Dictionary.getRandomWord();
        String mask = buildMask(word);
        int count = mask.length();


        while (currentScaffold.getCurrentState() != 7 && count > 0) {
            // вывод виселицы
            currentScaffold.printScaffold();
            // вывод маски
            System.out.println(mask);

            // ввод буквы
            char select = takeLetter();

            // проверка буквы и изменение  маски
            if(isContains(word, select)) {
                mask = replaceStarsWithLetter(word, mask, select);
                count --;
            } else {
                currentScaffold.changeState();
            }
        }

        if(count == 0) {

            System.out.println(word);
            System.out.println("\nYou win!\n");
        } else {
            currentScaffold.printScaffold();
            System.out.println("\nYou lose!\n");
        }
    }

    public static char takeLetter() {
        System.out.println("\nВведите букву: ");
        return (scanner.next().charAt(0));
    }

    // Функция для построения маски для угадываемого слова
    public static String buildMask(String word) {
        return "*".repeat(word.length());
    }

    // Функция для  проверки наличия буквы в слове
    public static Boolean isContains(String word, char letter) {
        return word.contains(String.valueOf(letter));
    }

    // Функция для замены звездочки на угаданную букву
    public static String replaceStarsWithLetter(String word, String mask, char letter) {
        StringBuilder newMask = new StringBuilder(mask);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                newMask.setCharAt(i, letter);
            }
        }
        return newMask.toString();
    }
}

//функция осуществляет валидацию ввода, проверку наличия буквы в слове, проверку наличия буквы в пуле уже отгаданных букв,
// уже введенных неверно букв