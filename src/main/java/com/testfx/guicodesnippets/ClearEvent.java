package com.testfx.guicodesnippets;

import javafx.event.Event;
import javafx.event.EventType;

public class ClearEvent extends Event {
    public static final EventType<ClearEvent> CLEAR_EVENT = new EventType<>(Event.ANY, "CLEAR_EVENT");

    public ClearEvent() {
        super(CLEAR_EVENT);
    }
}
