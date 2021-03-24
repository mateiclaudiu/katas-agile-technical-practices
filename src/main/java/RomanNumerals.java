import java.util.Map;

public class RomanNumerals {
    public String roman(int number) {
        if (number >= 10)
            return tenths(number);
        return units(number);
    }

    private String tenths(int number) {
        if (number==10) return "X";
        if (number==20) return "XX";
        else return "XXX";
    }

    private String units(int number) {
        Map<Integer, String> units = Map.of(
                1, "I",
                2, "II",
                3, "III",
                4, "IV",
                5, "V",
                6, "VI",
                7, "VII",
                8, "VIII",
                9, "IX"
        );
        return units.get(number);
    }

    private int digitAfterCOmma(double rumberAsRoundedDouble) {
        String substring = Double.toString(rumberAsRoundedDouble).substring(Double.toString(rumberAsRoundedDouble).indexOf(".") + 1);
        int number1 = Integer.parseInt(substring);
        return number1;
    }

    private String convert(int number) {
        return "";
    }

}
