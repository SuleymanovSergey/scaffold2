package app;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {

    public static Set<String> words;

    public static void initWords() {
        words = new HashSet<>();

        try {
            File file = new File("resources/dictionary.txt"); // Замените "file.txt" на путь к вашему файлу
            Scanner scanner = new Scanner(file);

            // Считывание всех слов и сохранение уникальных слов в Set
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }

    public static String getRandomWord() {

        // Получение случайного элемента из Set
        Random rand = new Random();

        int randomIndex = rand.nextInt(words.size());
        Iterator<String> iterator = words.iterator();

        for (int i = 0; i < randomIndex; i++) {
            iterator.next();
        }

        return iterator.next();
    }
}
//функция осуществляет выбор слова, считывает слова из файла и хранит их локально
