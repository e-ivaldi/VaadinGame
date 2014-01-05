package com.foolver.app.game.misc.mock;

import com.foolver.app.game.input.handlers.abstr.*;

public class MockInputHandler implements InputHandler{

	private MouseHandler mouseHandler = new MockMouseHandler();
	private KeyboardHandler keyboardHandler = new MockKeyboardHandler();

	@Override
	public MouseHandler getMouseHandler() {
		return mouseHandler;
	}

	@Override
	public KeyboardHandler getKeyboardHandler() {
		return keyboardHandler;
	}

}
