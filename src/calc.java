import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1. Рассчитать координаты портала из обычного мира в ад");
        System.out.println("2. Рассчитать координаты портала из ада в обычный мир");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите координаты портала в обычном мире (x, y, z):");
            System.out.print("x: ");

            int x = scanner.nextInt();
            System.out.print("y: ");

            int y = scanner.nextInt();
            System.out.print("z: ");

            int z = scanner.nextInt();

            int[] netherCoordinates = calculateNetherCoordinates(x, y, z);
            System.out.println("Координаты портала в аду: ");
            System.out.println("x: " + netherCoordinates[0]);
            System.out.println("y: " + netherCoordinates[1]);
            System.out.println("z: " + netherCoordinates[2]);
            
        } else if (choice == 2) {
            
            System.out.println("Введите координаты портала в аду (x, y, z):");
            System.out.print("x: ");
            
            int x = scanner.nextInt();
            System.out.print("y: ");

            int y = scanner.nextInt();
            System.out.print("z: ");

            int z = scanner.nextInt();

            int[] overworldCoordinates = calculateOverworldCoordinates(x, y, z);

            System.out.println("Координаты портала в обычном мире: ");
            System.out.println("x: " + overworldCoordinates[0]);
            System.out.println("y: " + overworldCoordinates[1]);
            System.out.println("z: " + overworldCoordinates[2]);
        } else {
            System.out.println("Некорректный выбор. Пожалуйста, выберите 1 или 2.");
        }
    }

    public static int[] calculateNetherCoordinates(int x, int y, int z) {
        int netherX = x / 8;
        int netherY = y;
        int netherZ = z / 8;

        return new int[] {netherX, netherY, netherZ};
    }

    public static int[] calculateOverworldCoordinates(int x, int y, int z) {
        int overworldX = x * 8;
        int overworldY = y;
        int overworldZ = z * 8;

        return new int[] {overworldX, overworldY, overworldZ};
    }
}