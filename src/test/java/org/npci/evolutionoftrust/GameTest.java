package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GameTest {

    @Test
    void shouldBeAbleToPlayOneRound() {
        Player one = new Player("one");
        Player two = new Player("two");
        Score actualScore = new Game(one, two, 1).score();

        assertThat(actualScore, is(new Score(2,2)));
    }
}
