import java.math.BigDecimal;
import java.math.RoundingMode;

public class BmiService {

    public double calculate(double m, double h) {
        double index;
        index = m * 10000 / (h * h);
        index = BigDecimal.valueOf(index).setScale(1, RoundingMode.HALF_UP).doubleValue();
        return index;
    }
}