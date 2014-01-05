package com.foolver.game.app.misc.mock;

import com.foolver.game.app.input.handlers.abstr.*;

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
