package com.foolver.game.app.states.impl;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.*;
import com.foolver.game.app.input.abstr.InputHandler;
import com.foolver.game.app.states.abstr.GameState;

public class LoginState extends GameState {

	public LoginState(Game game) {
		super(game);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas) {
		super.draw(gameTime, inputHandler, canvas);
	}

}