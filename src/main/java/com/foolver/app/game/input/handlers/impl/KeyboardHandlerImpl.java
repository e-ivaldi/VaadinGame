package com.foolver.app.game.input.handlers.impl;

import com.foolver.app.game.input.handlers.abstr.KeyboardHandler;
import com.foolver.app.integration.input.configurators.KeyboardHandlerConfigurator;

public class KeyboardHandlerImpl implements KeyboardHandler {

	private KeyboardHandlerConfigurator keyboardHandlerConfigurator;

	public KeyboardHandlerImpl(KeyboardHandlerConfigurator keyboardHandlerConfigurator) {
		this.keyboardHandlerConfigurator = keyboardHandlerConfigurator;
	}

	@Override
	public boolean isButtonClicked(int keyCode) {
		return keyboardHandlerConfigurator.isButtonClicked(keyCode);
	}

}
