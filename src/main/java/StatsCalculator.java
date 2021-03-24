import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class StatsCalculator {
    private final List<Integer> numbers;

    public StatsCalculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int min() {
        return this.numbers.stream().mapToInt(n-> n).min().getAsInt();
    }

    public int max() {
        return this.numbers.stream().mapToInt(n->n).max().getAsInt();
    }

    public int length() {
        return (int) this.numbers.stream().count();
    }

    public double average() {
        double sum = this.numbers.stream().mapToDouble(n->n).average().getAsDouble();
        return new BigDecimal(sum).setScale(6, RoundingMode.FLOOR).doubleValue();
    }
}
