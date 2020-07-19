package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.npci.evolutionoftrust.MoveType.CHEAT;
import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class RuleEngineTest {
    @Test
    void shouldHaveScoreOfDoubleTwoWhenBothPlayersCorporate() {
        Score score = new RuleEngine(CORPORATE, CORPORATE).score();
        Score expectedScore = new Score(2, 2);

        assertThat(score, is(expectedScore));
    }

    @Test
    void shouldHaveScoreOfDoubleMinusOneWhenBothPlayersCheat() {
        Score score = new RuleEngine(CHEAT, CHEAT).score();
        Score expectedScore = new Score(-1, -1);

        assertThat(score, is(expectedScore));
    }

    @Test
    void shouldHaveScoreOfThreeAndMinusOneWhenFirstPlayerCheatsButOtherCorporates() {
        Score score = new RuleEngine(CHEAT, CORPORATE).score();
        Score expectedScore = new Score(3, -1);

        assertThat(score, is(expectedScore));
    }
}
