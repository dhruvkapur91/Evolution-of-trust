package org.npci.evolutionoftrust;

import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class Game {
    private final Player one;
    private final Player two;
    private int numberOfRounds;

    public Game(Player one, Player two, int numberOfRounds) {
        this.one = one;
        this.two = two;
        this.numberOfRounds = numberOfRounds;
    }

    public Score score() {
        RuleEngine ruleEngine = new RuleEngine(one.getMove(), two.getMove());
        return ruleEngine.score().times(numberOfRounds);
    }
}
