package com.foolver.game.app.misc.mock;

import com.foolver.game.app.input.handlers.abstr.KeyboardHandler;

public class MockKeyboardHandler implements KeyboardHandler {

	@Override
	public boolean isButtonClicked(int keyCode) {
		return false;
	}

}
