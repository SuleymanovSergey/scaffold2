import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void start() {

    }

    public char takeLetter() {
        System.out.println("\nВведите букву: ");
        return (scanner.next().charAt(0));
    }

}

//функция осуществляет валидацию ввода, проверку наличия буквы в слове, проверку наличия буквы в пуле уже отгаданных букв,
// уже введенных неверно букв