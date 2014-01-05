package com.foolver.app.game;

import com.foolver.app.game.input.handlers.abstr.InputHandler;
import com.foolver.app.game.misc.GameTime;
import com.foolver.app.game.states.abstr.GameState;
import com.foolver.app.integration.misc.CanvasWrapper;
import com.vaadin.external.org.slf4j.*;

public class Game {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(Game.class);

	private GameState gameState;
	private InputHandler inputHandler;
	private GameTime gameTime;

	public Game(InputHandler inputHandler) {
		this.inputHandler = inputHandler;
		// TODO implement GameTime
		gameTime = new GameTime() {
		};
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

	public void update() {
		gameState.update(gameTime, inputHandler);
	}

	public void draw(CanvasWrapper canvasWrapper) {
		gameState.draw(gameTime, inputHandler, canvasWrapper);
	}

}
