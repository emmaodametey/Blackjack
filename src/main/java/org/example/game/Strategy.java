package org.example.game;

public enum Strategy {
    HIT(16),
    STICK(17),
    GO_BUST(21);

    private int limit = 0;

    Strategy(int limit){
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
