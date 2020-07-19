package org.npci.evolutionoftrust;

public class Game {
    private final Player one;
    private final Player two;

    public Game(Player one, Player two, int numberOfRounds) {
        this.one = one;
        this.two = two;
    }

    public Score score() {
        return new RuleEngine(one.getMove(), two.getMove()).score();
    }
}
