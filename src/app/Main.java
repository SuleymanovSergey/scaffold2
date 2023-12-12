package app;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Начать новую игру(Н) или выйти(В) из приложения ?");
            char select = scanner.next().charAt(0);
            if ((select == 'Н') || (select == 'н')) {
                Dictionary.initWords();
                Game.start();
            } else if ((select == 'В') || (select == 'в')) {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Некорректный ввод, введите корректный символ");
            }
        }
    }
}
//вызов функций, использование while для работы геймлупа