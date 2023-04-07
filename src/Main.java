public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(1.87, 98);

        int index = (int) bmi;
        System.out.println(index);
    }
}
