// Универсальный метод считывания данных с консоли.
import java.util.Scanner;

public class Prompt {

        String prompt(String message) {
        Scanner in = new Scanner(System.in);
            System.out.print(message);
            return in.nextLine();
        }
    }
