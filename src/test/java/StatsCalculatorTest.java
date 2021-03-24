import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StatsCalculatorTest {

    private final List<Integer> numbers = Arrays.asList(6, 9, 15, -2, 92, 11);

    @Test
    void minValue() {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int actual = statsCalculator.min();

        assertThat(actual).isEqualTo(-2);
    }

    @Test
    void maxValue() {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int actual = statsCalculator.max();

        assertThat(actual).isEqualTo(92);
    }

    @Test
    void numberOfElements() {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int actual = statsCalculator.length();

        assertThat(actual).isEqualTo(6);
    }

    @Test
    void averageValue() {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        double actual = statsCalculator.average();

        assertThat(actual).isEqualTo(21.833333);
    }
}
