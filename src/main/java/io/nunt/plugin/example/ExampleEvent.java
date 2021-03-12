package io.nunt.plugin.example;

import io.nunt.core.plugin.event.Event;

public class ExampleEvent extends Event {

    private final String example;

    public ExampleEvent(String example) {
        this.example = example;
    }

    public String getExample() {
        return example;
    }
}
