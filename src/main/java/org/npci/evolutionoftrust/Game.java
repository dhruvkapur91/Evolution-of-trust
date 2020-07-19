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
        Score score = ruleEngine.score();

        for(int i = 0; i < numberOfRounds; i++) {
            one.setScoreFor(i+1, score.getForPlayerOne());
            two.setScoreFor(i+1, score.getForPlayerTwo());
        }

        return score.times(numberOfRounds);
    }
}
