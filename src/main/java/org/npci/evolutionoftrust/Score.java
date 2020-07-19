package org.npci.evolutionoftrust;

import java.util.Objects;

public class Score {
    private final int playerOne;
    private final int playerTwo;

    public Score(int playerOne, int playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return playerOne == score.playerOne &&
                playerTwo == score.playerTwo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerOne, playerTwo);
    }

    @Override
    public String toString() {
        return "Score{" +
                "playerOne=" + playerOne +
                ", playerTwo=" + playerTwo +
                '}';
    }
}
