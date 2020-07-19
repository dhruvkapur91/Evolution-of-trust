package org.npci.evolutionoftrust;

import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class Player {
    public Player(String name) {
    }

    public int scoreAt(int roundNumber) { // TODO - not unit tested yet.
        return 2;
    }

    public MoveType getMove() {
        return CORPORATE;
    }
}
