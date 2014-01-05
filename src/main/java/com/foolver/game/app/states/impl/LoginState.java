package com.foolver.game.app.states.impl;

import com.foolver.game.app.Game;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.GameTime;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.integration.misc.CanvasWrapper;

public class LoginState extends GameState {

	public LoginState(Game game) {
		super(game);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		super.draw(gameTime, inputHandler, canvasWrapper);
	}

}
