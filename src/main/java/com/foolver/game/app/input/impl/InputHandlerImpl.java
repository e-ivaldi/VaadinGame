package com.foolver.game.app.input.impl;

import com.foolver.game.app.input.abstr.*;

public class InputHandlerImpl implements InputHandler {

	private MouseHandler mouseHandler;
	private KeyboardHandler keyboardHandler;

	public InputHandlerImpl(MouseHandler mouseHandler, KeyboardHandler keyboardHandler){
		this.mouseHandler = mouseHandler;
		this.keyboardHandler = keyboardHandler;
	}

	@Override
	public MouseHandler getMouseHandler() {
		return this.mouseHandler;
	}

	@Override
	public KeyboardHandler getKeyboardHandler() {
		return this.keyboardHandler;
	}
}
