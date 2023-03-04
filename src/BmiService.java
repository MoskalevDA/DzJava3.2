public class BmiService {
    public int calculate(int a, double b) {
        double  result;
        result = a / (b * b);

        return (int) result;
    }
}
