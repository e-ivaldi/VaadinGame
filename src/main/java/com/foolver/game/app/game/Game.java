package com.foolver.game.app.game;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.input.abstr.InputHandler;
import com.foolver.game.app.states.abstr.GameState;
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

	public void draw(Canvas canvas) {
		gameState.draw(gameTime, inputHandler, canvas);
	}

}
