package com.foolver.game.app.input.impl;

import com.foolver.game.app.input.abstr.*;

public class InputHandlerImpl implements InputHandler {

	private MouseHandler mouseHandler;
	private KeyboardHandler keyboardHandler;

	@Override
	public MouseHandler getMouseHandler() {
		return this.mouseHandler;
	}

	@Override
	public KeyboardHandler getKeyboardHandler() {
		return this.keyboardHandler;
	}

	public void setMouseHandler(MouseHandler mouseHandler) {
		this.mouseHandler = mouseHandler;
	}

	public void setKeyboardHandler(KeyboardHandler keyboardHandler) {
		this.keyboardHandler = keyboardHandler;
	}

}
