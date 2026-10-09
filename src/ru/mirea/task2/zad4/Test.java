package ru.mirea.task2.zad4;
import java.util.Scanner;

public class Test {
    private static int readInt(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value >= min && value <= max) {
                    return value;
                }
            } catch (NumberFormatException exception) {
            }
            System.out.println("Введите целое число от " + min + " до " + max);
        }
    }

    private static double readPrice(Scanner scanner) {
        while (true) {
            System.out.print("Цена: ");
            try {
                double price = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
                if (Double.isFinite(price) && price >= 0) {
                    return price;
                }
            } catch (NumberFormatException exception) {
            }
            System.out.println("Введите неотрицательную цену");
        }
    }

    private static String readText(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Значение не должно быть пустым");
        }
    }

    private static Computer readComputer(Scanner scanner) {
        String model = readText(scanner, "Модель: ");
        String processor = readText(scanner, "Процессор: ");
        int ram = readInt(scanner, "ОЗУ (ГБ): ", 1, Integer.MAX_VALUE);
        double price = readPrice(scanner);
        return new Computer(model, processor, ram, price);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Shop shop = new Shop();
            int count = readInt(scanner, "Количество компьютеров: ", 0, Integer.MAX_VALUE);
            for (int i = 0; i < count; i++) {
                System.out.println("Компьютер " + (i + 1));
                shop.addComputer(readComputer(scanner));
            }
            while (true) {
                System.out.println("1 — добавить, 2 — удалить, 3 — найти, 4 — показать, 0 — выход");
                int action = readInt(scanner, "Действие: ", 0, 4);
                switch (action) {
                    case 1:
                        shop.addComputer(readComputer(scanner));
                        break;
                    case 2:
                        String model = readText(scanner, "Модель для удаления: ");
                        System.out.println(shop.removeComputer(model) ? "Удалён" : "Не найден");
                        break;
                    case 3:
                        Computer computer = shop.findComputer(readText(scanner, "Модель для поиска: "));
                        System.out.println(computer == null ? "Не найден" : computer);
                        break;
                    case 4:
                        System.out.println("Компьютеров: " + shop.getCount());
                        shop.printComputers();
                        break;
                    case 0:
                        return;
                    default:
                        break;
                }
            }
        }
    }
}
