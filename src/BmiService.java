public class BmiService {

    public int calculat(double HeightMeters, double WeightKilograms) {
        double result = WeightKilograms / (HeightMeters * HeightMeters);
        return (int) result;
    }
}
