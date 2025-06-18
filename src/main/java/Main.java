import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + "! 😊");
    }
}