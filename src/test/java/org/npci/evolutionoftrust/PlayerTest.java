package org.npci.evolutionoftrust;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.npci.evolutionoftrust.MoveType.CORPORATE;

class PlayerTest {

    @Test
    void playerShouldAlwaysCorporate() {
        assertThat(new Player("a").getMove(), is(CORPORATE));
    }

    @Test
    void shouldGiveScoreForTheRoundThatHasBeenPlayed() {
        Player player = new Player("a");
        player.setScoreFor(1,0);

        assertThat(player.scoreAt(1), is(0));
    }

    @Test
    void shouldGiveScoreForAnyRoundThatHasBeenPlayed() {
        Player player = new Player("a");
        player.setScoreFor(1,0);
        player.setScoreFor(2,1);

        assertThat(player.scoreAt(1), is(0));
        assertThat(player.scoreAt(2), is(1));
    }

}