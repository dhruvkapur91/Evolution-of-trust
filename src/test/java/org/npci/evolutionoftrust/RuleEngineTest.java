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
        List<Integer> scores = new RuleEngine(CORPORATE, CHEAT).score();
        Score expectedScore = new Score(2, 2);
        assertThat(scores.get(0), is(expectedScore.getPlayer1Score()));
        assertThat(scores.get(1), is(expectedScore.getPlayer2Score()));
    }
}
