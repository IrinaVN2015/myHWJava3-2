public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {

        double calcBmi = (weightInKilograms / (heightInMeters * heightInMeters));


        return (int) calcBmi;

    }
}
