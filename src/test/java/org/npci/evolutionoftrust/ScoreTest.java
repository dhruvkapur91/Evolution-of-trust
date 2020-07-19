package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// TODO - scores are used inconsistently...
class ScoreTest {
    @Test
    void twoScoresWithSameValuesShouldBeEqual() {
        assertEquals(new Score(2,2), new Score(2,2));
    }

    @Test
    void twoScoresWithDifferentValuesShouldNotBeEqual() {
        assertNotEquals(new Score(2,2), new Score(2,1));
    }

    @Test
    void scoreObjectShouldNotBeEqualToObjectOfOtherTypes() {
        assertNotEquals(new Score(2,2), 22);
    }

    @Test
    void shouldNotHaveDuplicateScoresInASet() {
        HashSet<Score> scores = new HashSet<>();
        scores.add(new Score(2,2));
        scores.add(new Score(2,2));
        assertThat(scores.size(), is(1));
    }

    @Test
    void toStringShouldHelpInDebugging() {
        String actual = new Score(2, 2).toString();
        assertThat(actual, is("Score{playerOne=2, playerTwo=2}"));
    }

    @Test
    void shouldBeAbleToMultiplyScore() { // TODO - one assertion per test
        Score score_2_2 = new Score(2, 2);
        Score score_0_0 = new Score(0, 0);
        Score score_Minus1_Minus1 = new Score(-1, -1);

        assertThat(score_2_2.times(1), is(score_2_2));
        assertThat(score_2_2.times(0), is(score_0_0));
        assertThat(score_Minus1_Minus1.times(1), is(score_Minus1_Minus1));
    }
}