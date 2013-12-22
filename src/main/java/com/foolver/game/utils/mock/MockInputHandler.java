package com.foolver.game.utils.mock;

import com.foolver.game.app.input.abstr.*;

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

	@Override
	public void setKeyboardHandler(KeyboardHandler keyboardHandler) {

	}

	@Override
	public void setMouseHandler(MouseHandler mouseHandler) {

	}

}
