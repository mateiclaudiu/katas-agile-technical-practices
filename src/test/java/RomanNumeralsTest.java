import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    RomanNumerals numerals = new RomanNumerals();

    @DisplayName("1 is I")
    @Test
    void _1_is_I() {
        String actual = numerals.roman(1);
        assertThat(actual).isEqualTo("I");
    }

    @DisplayName("2 is II")
    @Test
    void _2_is_II() {
        String actual = numerals.roman(2);
        assertThat(actual).isEqualTo("II");
    }

    @DisplayName("3 is III")
    @Test
    void _3_is_III() {
        String actual = numerals.roman(3);
        assertThat(actual).isEqualTo("III");
    }

    @DisplayName("4 is IV")
    @Test
    void _4_is_IV() {
        String actual = numerals.roman(4);
        assertThat(actual).isEqualTo("IV");
    }

    @DisplayName("5 is 5V")
    @Test
    void _5_is_IV() {
        String actual = numerals.roman(5);
        assertThat(actual).isEqualTo("V");
    }

    @DisplayName("6 is VI")
    @Test
    void _6_is_VI() {
        String actual = numerals.roman(6);
        assertThat(actual).isEqualTo("VI");
    }

    @DisplayName("7 is VII")
    @Test
    void _7_is_VII() {
        String actual = numerals.roman(7);
        assertThat(actual).isEqualTo("VII");
    }

    @DisplayName("8 is VIII")
    @Test
    void _8_is_VIII() {
        String actual = numerals.roman(8);
        assertThat(actual).isEqualTo("VIII");
    }

    @DisplayName("9 is IX")
    @Test
    void _9_is_IX() {
        String actual = numerals.roman(9);
        assertThat(actual).isEqualTo("IX");
    }

    @DisplayName("10 is X")
    @Test
    void _10_is_IX() {
        String actual = numerals.roman(10);
        assertThat(actual).isEqualTo("X");
    }

    @DisplayName("20 is XX")
    @Test
    void _20_is_XX() {
        String actual = numerals.roman(20);
        assertThat(actual).isEqualTo("XX");
    }


    @DisplayName("30 is XX")
    @Test
    void _30_is_XXX() {
        String actual = numerals.roman(30);
        assertThat(actual).isEqualTo("XXX");
    }



    @Disabled
    @DisplayName("40 is XL")
    @Test
    void _40_is_XL() {
        String actual = numerals.roman(40);
        assertThat(actual).isEqualTo("XL");
    }



    @Disabled
    @DisplayName("45 is XLV")
    @Test
    void _45_is_XLV() {
        String actual = numerals.roman(45);
        assertThat(actual).isEqualTo("XLV");
    }


    @Disabled
    @DisplayName("16 is XVI")
    @Test
    void _16_is_XVI() {
        String actual = numerals.roman(16);
        assertThat(actual).isEqualTo("XVI");
    }

    @Disabled
    @DisplayName("29 is XXIX")
    @Test
    void _29_is_XXIX() {
        String actual = numerals.roman(29);
        assertThat(actual).isEqualTo("XXIX");
    }

    @Disabled
    @DisplayName("50 is L")
    @Test
    void _50_is_L() {
        String actual = numerals.roman(50);
        assertThat(actual).isEqualTo("L");

    }
    @Disabled
    @DisplayName("60 is LX")
    @Test
    void _60_is_LX() {
        String actual = numerals.roman(60);
        assertThat(actual).isEqualTo("LX");
    }


    @Disabled
    @DisplayName("70 is LXX")
    @Test
    void _70_is_LXX() {
        String actual = numerals.roman(70);
        assertThat(actual).isEqualTo("LXX");
    }


    @Disabled
    @DisplayName("80 is LXXX")
    @Test
    void _80_is_LXXX() {
        String actual = numerals.roman(80);
        assertThat(actual).isEqualTo("LXXX");
    }
}
