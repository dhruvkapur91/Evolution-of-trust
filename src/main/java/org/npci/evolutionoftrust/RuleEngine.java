package org.npci.evolutionoftrust;

import static org.npci.evolutionoftrust.MoveType.CHEAT;
import static org.npci.evolutionoftrust.MoveType.CORPORATE;

public class RuleEngine {
    private final MoveType one;
    private final MoveType two;

    public RuleEngine(MoveType one, MoveType two) {
        this.one = one;
        this.two = two;
    }

    public Score score() {
        if(one.equals(CHEAT) && two.equals(CORPORATE)) {
            return new Score(3,-1);
        }
        if(one.equals(CHEAT)) {
            return new Score(-1,-1);
        }
        return new Score(2,2);
    }
}
