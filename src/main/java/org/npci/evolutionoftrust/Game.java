package org.npci.evolutionoftrust;

import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class Game {
    public Game(Player one, Player two, int numberOfRounds) {

    }

    public Score score() {
        return new RuleEngine(CORPORATE, CORPORATE).score();
    }
}
