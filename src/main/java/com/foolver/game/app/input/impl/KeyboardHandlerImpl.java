package com.foolver.game.app.input.impl;

import com.foolver.game.app.input.abstr.KeyboardHandler;

public class KeyboardHandlerImpl implements KeyboardHandler {

	private KeyboardHandlerConfigurator keyboardHandlerConfigurator;

	public KeyboardHandlerImpl(KeyboardHandlerConfigurator keyboardHandlerConfigurator){
		this.keyboardHandlerConfigurator = keyboardHandlerConfigurator;
	}

	@Override
	public boolean isButtonClicked(int keyCode){
		return keyboardHandlerConfigurator.isButtonClicked(keyCode);
	}

}
