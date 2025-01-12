package org.zab.entities;

import org.springframework.stereotype.Component;
import zab.History;
import zab.State;

@Component
public class Node {

    private Long id;

    private State state;

    private History history;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
