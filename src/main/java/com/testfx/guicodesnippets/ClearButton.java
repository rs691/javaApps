package com.testfx.guicodesnippets;

import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ClearButton extends Button {
    public ClearButton() {
        super("Clear");
        this.setOnAction(e -> fireClearEvent());
    }
    private void fireClearEvent() {
        fireEvent(new ClearEvent());
    }
}
