package com.foolver.app.game.states.impl;

import com.foolver.app.game.Game;
import com.foolver.app.game.input.handlers.abstr.InputHandler;
import com.foolver.app.game.misc.GameTime;
import com.foolver.app.game.states.abstr.GameState;
import com.foolver.app.game.world.Level;
import com.foolver.app.integration.misc.CanvasWrapper;

public class PlayState extends GameState {

	private Level level = new Level();

	public PlayState(Game game) {
		super(game);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		level.draw(gameTime, inputHandler, canvasWrapper);
		super.draw(gameTime, inputHandler, canvasWrapper);
	}

}
