package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.npci.evolutionoftrust.MoveType.CHEAT;
import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class RuleEngineTest {
    @Test
    void shouldHaveScoreOfDoubleTwoWhenBothPlayersCorporate() {
        Score score = new RuleEngine(CORPORATE, CHEAT).score();
        Score expectedScore = new Score(2, 2);

        assertThat(score, is(expectedScore));
    }
}
