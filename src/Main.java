public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 82.0;
        double height = 162.0;

        double bmi = service.calculate(mass, height);

        System.out.println("Рост: " + height + ", масса: " + mass);
        System.out.println("ИМТ: " + bmi);
    }
}