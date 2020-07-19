package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GameTest {

    @Test
    void shouldBeAbleToPlayOneRound() {
        Player one = new Player("one");
        Player two = new Player("two");
        Score actualScore = new Game(one, two, 1).score();

        assertThat(actualScore, is(new Score(2,2))); // TODO - One assertion per test?
        assertThat(one.scoreAt(1), is(2));
        assertThat(two.scoreAt(1), is(2));
    }

    @Test
    void shouldBeAbleToPlayTwoRound() {
        Player one = new Player("one");
        Player two = new Player("two");
        Score actualScore = new Game(one, two, 2).score();

        assertThat(actualScore, is(new Score(4,4))); // TODO - One assertion per test?
        assertThat(one.scoreAt(1), is(2));
        assertThat(two.scoreAt(1), is(2));
        assertThat(one.scoreAt(2), is(4));
        assertThat(two.scoreAt(2), is(4));
    }
}
