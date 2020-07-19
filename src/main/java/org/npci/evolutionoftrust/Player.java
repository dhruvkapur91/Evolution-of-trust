package org.npci.evolutionoftrust;

import java.util.HashMap;
import java.util.Map;

import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class Player {
    private final Map<Integer,Integer> scores = new HashMap<>();

    public Player(String name) {
    }

    public int scoreAt(int roundNumber) {
        return scores.get(roundNumber);
    }

    public MoveType getMove() {
        return CORPORATE;
    }

    public void setScoreFor(int roundNumber, int score) {
        this.scores.put(roundNumber, score);
    }
}
