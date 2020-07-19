package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
}