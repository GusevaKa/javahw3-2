public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double HeightMeters = 1.87;
        double WeightKilograms = 98;
        int bmi = service.calculat(HeightMeters, WeightKilograms);
        System.out.println(bmi);
    }
}