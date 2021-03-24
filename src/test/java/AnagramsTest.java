import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {

    @Disabled
    @Test
    void name() {
        Anagram anagram = new Anagram();
        List<String> actual = anagram.get("biro");
        Assertions.assertThat(actual)
                .containsExactlyInAnyOrder("biro","bior","brio","broi","boir","bori");
    }
}
