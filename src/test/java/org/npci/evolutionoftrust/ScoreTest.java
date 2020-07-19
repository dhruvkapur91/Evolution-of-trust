package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

}