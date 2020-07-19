package org.npci.evolutionoftrust;

import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class Player {
    private Integer score;

    public Player(String name) {
    }

    public int scoreAt(int roundNumber) { // TODO - not unit tested yet.
        if(this.score == null) {
            return 2 * roundNumber;
        }
        return score;
    }

    public MoveType getMove() {
        return CORPORATE;
    }

    public void setScoreFor(int roundNumber, int score) {
        this.score = score;
    }
}
