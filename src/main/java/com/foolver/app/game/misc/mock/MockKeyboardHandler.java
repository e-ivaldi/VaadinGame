package com.foolver.app.game.misc.mock;

import com.foolver.app.game.input.handlers.abstr.KeyboardHandler;

public class MockKeyboardHandler implements KeyboardHandler {

	@Override
	public boolean isButtonClicked(int keyCode) {
		return false;
	}

}
