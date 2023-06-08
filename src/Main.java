public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; // Рост
        int weight = 98; // Вес
        double a = service.calculate(height, weight);

        System.out.println("Рост " + height + "м");
        System.out.println("Вес " + weight + "кг");
        System.out.println();
        System.out.println("Индекс массы тела " + a);
    }
}