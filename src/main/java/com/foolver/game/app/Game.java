package com.foolver.game.app;

import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.GameTime;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.integration.misc.CanvasWrapper;
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
