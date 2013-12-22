package com.foolver.game.utils.mock;

import com.foolver.game.app.input.abstr.KeyboardHandler;

public class MockKeyboardHandler implements KeyboardHandler {

	@Override
	public boolean isButtonClicked(int keyCode) {
		return false;
	}

}
